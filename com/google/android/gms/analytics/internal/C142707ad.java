package com.google.android.gms.analytics.internal;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.gms.analytics.internal.ad */
/* compiled from: PG */
final class C142707ad {
    /* renamed from: a */
    public static final C142717an m231542a(int i, C142716am amVar, C142736f fVar) {
        try {
            return m231543b(fVar.f387328e.f387335c.getResources().getXml(i), amVar, fVar);
        } catch (Resources.NotFoundException e) {
            fVar.mo117536i(5, "inflate() called with unknown resourceId", e, (Object) null, (Object) null);
            return null;
        }
    }

    /* renamed from: b */
    private static final C142717an m231543b(XmlResourceParser xmlResourceParser, C142716am amVar, C142736f fVar) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                amVar.f387281b.f387282a = trim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                amVar.f387281b.f387283b = trim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                amVar.f387281b.f387284c = trim2;
                            } else {
                                amVar.f387280a.mo117548h().mo117536i(5, "String xml configuration name not recognized", attributeValue2, (Object) null, (Object) null);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                boolean parseBoolean = Boolean.parseBoolean(trim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    amVar.f387281b.f387286e = parseBoolean ? 1 : 0;
                                } else {
                                    amVar.f387280a.mo117548h().mo117536i(5, "Bool xml configuration name not recognized", attributeValue3, (Object) null, (Object) null);
                                }
                            } catch (NumberFormatException e) {
                                fVar.mo117536i(5, "Error parsing bool configuration value", trim3, e, (Object) null);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                int parseInt = Integer.parseInt(trim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    amVar.f387281b.f387285d = parseInt;
                                } else {
                                    amVar.f387280a.mo117548h().mo117536i(5, "Int xml configuration name not recognized", attributeValue4, (Object) null, (Object) null);
                                }
                            } catch (NumberFormatException e2) {
                                fVar.mo117536i(5, "Error parsing int configuration value", trim4, e2, (Object) null);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            fVar.mo117536i(6, "Error parsing tracker configuration file", e3, (Object) null, (Object) null);
        } catch (IOException e4) {
            fVar.mo117536i(6, "Error parsing tracker configuration file", e4, (Object) null, (Object) null);
        }
        return amVar.f387281b;
    }
}
