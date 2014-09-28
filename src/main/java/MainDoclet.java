import com.logikdev.swagger.springmvcdoclet.ServiceDoclet;


public class MainDoclet {

	public static void main(String[] args) {
		String[] javacArguments = {
		        "-doclet",
		        ServiceDoclet.class.getName(),
		        "-classpath",
		        "/home/smoreau/Documents/Ritmx/DocletClasspath/18922716_castor-1.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/frontoffice-auth-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/36249deb_icu4j-2.8.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8f258fb0_batik-dom-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/20deb6a6_etoil-common-0.19.0-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/9d3e6ad3_jsr94-1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/94f154e7_axiom-api-1.2.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/d95f3d8a_jxl-2.4.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/60ab8743_bcprov-jdk16-140.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/fc3bdd7b_itext-2.1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a1e05480_cxf-rt-transports-http-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e095b604_java-property-utils-1.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/2fb5b354_spring-webmvc-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/29a772af_cxf-rt-core-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/59aa954c_jaxws-api-2.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3f3984ac_commons-fileupload-1.1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8d3b562b_axis-saaj-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/1fb46e90_bcmail-jdk14-138.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/471126a4_commons-jci-eclipse-3.2.0.666.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e24f6080_jamon-2.73.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ca4cc0de_dozer-5.4.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8d1397a0_batik-svggen-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/344d31ef_axiom-impl-1.2.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/7a50b63d_xxxter-core-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b5e02379_remoting-clients-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/7b8cdae1_batik-awt-util-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8ee43ef8_xfire-java5-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/fda17095_batik-transcoder-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/jackson-mapper-asl-1.9.13.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/d791f576_geronimo-ws-metadata_2.0_spec-1.1.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e021dcf6_xfire-jaxb2-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8b584b37_antlr-3.0ea8.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f6ae9843_spring-web-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5d9ab3e8_spring-security-config-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/57d03e46_client-slc-lv-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/dc46cacc_backport-util-concurrent-3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f9bf913d_annogen-0.1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/de5c22d5_frontoffice-auth-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3ce4c0ca_commons-discovery-0.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/547dd306_spring-security-ldap-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3d3c5e68_commons-validator-1.1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/955289cd_client-slc-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5e9e0538_cxf-rt-bindings-xml-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3946dd9f_XmlSchema-1.3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5e7be5c0_XmlSchema-1.4.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/90f40123_opensaml-1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/4d984ce4_tiles-template-2.2.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b144f9cb_agendpoint-1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/0b194581_frontoffice-common-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/c46f0ed4_commons-digester-1.8.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/fb03ec39_htmlparser-1.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/9b95e8f3_commons-collections-3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f164023c_ant-1.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ef98cec1_mail-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/fc5adeac_spring-expression-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8e05923b_batik-css-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/4320ca9b_drools-compiler-3.0.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8cfd7352_xfire-jsr181-api-1.0-M1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8e547ee2_cxf-rt-ws-security-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/2f84744d_wsdl4j-1.6.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/cors-filter-1.3.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/68b01b35_jaxen-1.1-beta-8.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/1a70017b_bcprov-jdk14-138.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/79cf8453_cxf-common-schemas-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e9790dd7_batik-svg-dom-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/98150d06_xxxter-common-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/1f631830_cxf-rt-frontend-simple-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/fdfaf793_xfire-core-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/143c6d5e_jsr94-tck-1.0.3.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/22a30334_javassist-3.16.1-GA.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/17427752_spring-context-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a31996d7_rules-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3286696d_batik-bridge-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/20033ae9_axis2-kernel-1.4.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/332a1d56_cxf-rt-bindings-soap-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/aff44363_drools-core-3.0.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/dd839625_xom-1.0b3.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/41f6a43c_spring-security-core-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f06f9061_concurrent-1.3.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/88959816_axiom-dom-1.2.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ca01e979_tagsoup-0.9.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/38842653_antlr-2.7.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/0774fa5e_stringtemplate-2.3b6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/db4b99d4_ehcache-core-2.4.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a760ab89_jline-0.9.94.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/562d7574_spring-context-support-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/39e41360_axis-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/6c2f731d_xfire-aegis-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/d533ae15_cxf-rt-frontend-jaxws-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/41788e28_spring-asm-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/309e1b9e_jaxb-xjc-2.0.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/0062d44c_hibernate-jpa-2.0-api-1.0.1.Final.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/9890f041_ritmx-configuration-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/2eafa811_commons-beanutils-core-1.8.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f1d43306_xbean-spring-2.8.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/c440ddd1_spring-ldap-core-1.3.1.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b8267a55_quartz-1.6.0.RC.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e0922513_geronimo-annotation_1.0_spec-1.1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/56f3d75b_spring-beans-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b4a3e5a3_xml-resolver-1.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a664efb0_wstx-asl-3.2.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/0c73432d_tiles-jsp-2.2.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b5c05902_axis2-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/cade8463_acme-1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/eedf26d6_xmlsec-1.4.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ae977d42_batik-ext-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/bda8c125_xpp3_min-1.1.4c.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/7b2eb76b_axis2-adb-1.4.RC.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/6c3a28cf_tiles-core-2.2.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/c768bbb6_ritmx-core-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/aef44014_ritmx-ldap-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/4f7dffa8_commons-fileupload-1.1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/1fe6ee9e_commons-configuration-1.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/272e30d9_cxf-tools-common-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5e5efeb0_drools-jsr94-3.0.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3601b3e2_spring-tx-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/bbc4c56e_httpcore-4.0-beta1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/376a7733_poi-3.2-FINAL.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/cbda8a93_spring-core-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/42f11765_fdsapi-1.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/89ab4da7_colt-1.2.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/828f5630_xmlbeans-2.3.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/1960195c_xfire-annotations-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/663a5bef_aopalliance-1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/1c9e6d88_jsr94-sigtest-1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/728f1c53_httpcore-nio-4.0-beta1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a602812c_billettique-client-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/d1c44f07_commons-codec-1.3.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/51e5d64d_jackson-mapper-asl-1.9.13.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e3420291_dom4j-1.6.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/bea2ef31_client-slc-lm-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/032080af_xfire-spring-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/97e04dd5_fop-0.95.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/285cd023_saaj-api-1.3.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ebf86acc_commons-lang3-3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/482a0089_policy-0.92-20060310.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/07529d25_standard-1.1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/d97bf0dc_raztec-1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/63d76330_junit-4.3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/bfa8b8bf_wss4j-1.5.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/fbe50c6d_saaj-impl-1.3.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/facc42a6_qdox-1.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/74b04881_batik-script-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/7985bc89_tiles-servlet-2.2.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a0e330bf_batik-anim-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/9a4f191d_batik-parser-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/27f20c63_commons-beanutils-1.7.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5f8c8c2a_neethi-2.0.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/922cc0e5_jakarta-regexp-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/acd1b74c_jackson-core-asl-1.9.13.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/15d2559f_jsr181-api-1.0-MR1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ecc92967_slf4j-api-1.6.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/24b57fbb_slf4j-log4j12-1.6.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/ea2a2f61_woden-api-1.0M8.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/65c71ea4_commons-jci-janino-2.4.3.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f06cc344_wstx-asl-3.2.1.RC.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f8e75a2c_commons-attributes-api-2.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/590b1232_stax-utils-20040917.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/15143fb5_spring-jdbc-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/2e60e6da_commons-lang-2.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/358ede7b_avalon-framework-api-4.3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3a565347_commons-httpclient-3.0.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/38104ced_joda-time-2.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/59b523ec_spring-oxm-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/12dd4d05_cxf-common-utilities-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8e70ace4_cxf-api-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/0fee1692_jung-1.7.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/3337bfe9_billettique-common-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/7a8fdc1e_drools-decisiontables-3.0.5.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/edbe5a40_batik-gvt-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a7c72548_ant-launcher-1.7.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b7813c26_xfire-xmlbeans-1.2.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/a3f67643_frontoffice-core-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/8374b7a9_spring-security-acl-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/2e6b2079_lib-ext-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/636d0a1c_spring-orm-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/51ddc255_commons-io-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/08aa2bb6_cxf-rt-databinding-jaxb-2.0.10.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/791710a7_spring-aop-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/java-property-utils-1.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5f15ccd4_jdom-1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/0e937f84_batik-extension-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/5d4b36e3_groovy-all-1.5.6.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/4f6a6e82_xstream-1.3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/92070576_framework-core-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/57b06f47_batik-xml-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/871b2211_commons-logging-1.1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/f7b27727_hibernate-commons-annotations-3.2.0.Final.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/4473e82b_cors-filter-1.3.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/58344368_batik-util-1.7.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/4df40e74_ant-1.7.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/72c1a615_axis2-codegen-1.4.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/604c2cf9_commons-jci-core-1.0-406301.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/9916eeef_spring-security-taglibs-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/d878f423_moteur-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/41b5d8ac_xmlgraphics-commons-1.3.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/commons-fileupload-1.1.1.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/2c91a5ef_jsr250-api-1.0.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/7e707b97_hibernate-core-3.6.10.Final.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/jackson-core-asl-1.9.13.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/b70c62d0_tiles-api-2.2.2.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e13cf111_ritmx-common-2.2.61-SNAPSHOT.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/c48a6462_spring-security-web-3.0.7.RELEASE.jar:/home/smoreau/Documents/Ritmx/DocletClasspath/e5eb9793_etoil-core-0.19.0-SNAPSHOT.jar",
		        "-sourcepath",
		        "/home/smoreau/workspace-ritmx/etoil-web/src/main/java",
		        "-docBasePath",
		        "http://etoil-swagger.local",
		        "-apiBasePath",
		        "http://localhost:8080/etoil",
		        "com.sncf.ritmx.etoil.web" 
		};
		com.sun.tools.javadoc.Main.execute(javacArguments);

	}

}
