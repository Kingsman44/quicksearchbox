package com.google.android.play.core.p3538g;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.g.ba */
/* compiled from: PG */
final class C45145ba {
    /* renamed from: a */
    static final C45172g m80368a(XmlPullParser xmlPullParser, C45171f fVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String b = m80369b("name", xmlPullParser);
                                    if (b != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String b2 = m80369b("key", xmlPullParser);
                                                                String b3 = m80369b("split", xmlPullParser);
                                                                m80370c(xmlPullParser);
                                                                if (!(b2 == null || b3 == null)) {
                                                                    if (!fVar.f117910a.containsKey(b2)) {
                                                                        fVar.f117910a.put(b2, new HashMap());
                                                                    }
                                                                    ((Map) fVar.f117910a.get(b2)).put(b, b3);
                                                                }
                                                            } else {
                                                                m80370c(xmlPullParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    m80370c(xmlPullParser);
                                                }
                                            }
                                        }
                                    } else {
                                        m80370c(xmlPullParser);
                                    }
                                } else {
                                    m80370c(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        m80370c(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : fVar.f117910a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new C45172g(Collections.unmodifiableMap(hashMap));
    }

    /* renamed from: b */
    private static final String m80369b(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static final void m80370c(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
