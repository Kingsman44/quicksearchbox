package androidx.media3.common.p136b;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.media3.common.b.al */
/* compiled from: PG */
public final class C2613al {
    /* renamed from: a */
    public static String m7002a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m7003b(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: c */
    public static boolean m7004c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m7005d(XmlPullParser xmlPullParser, String str) {
        return m7004c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m7006e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m7007f(XmlPullParser xmlPullParser, String str) {
        return m7006e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
