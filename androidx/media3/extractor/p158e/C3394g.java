package androidx.media3.extractor.p158e;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2613al;
import androidx.media3.common.p136b.C2633u;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: androidx.media3.extractor.e.g */
/* compiled from: PG */
final class C3394g {

    /* renamed from: a */
    private static final String[] f10278a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f10279b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f10280c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C3390c m9813a(String str) {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (C2613al.m7007f(newPullParser, "x:xmpmeta")) {
                C58485gu m = C58485gu.m89845m();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (C2613al.m7007f(newPullParser, "rdf:Description")) {
                        String[] strArr = f10278a;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String a = C2613al.m7002a(newPullParser, strArr[i2]);
                            if (a == null) {
                                i2++;
                            } else if (Integer.parseInt(a) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f10279b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a2 = C2613al.m7002a(newPullParser, strArr2[i3]);
                                    if (a2 != null) {
                                        j = Long.parseLong(a2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f10280c;
                                while (true) {
                                    if (i >= 2) {
                                        m = C58485gu.m89845m();
                                        break;
                                    }
                                    String a3 = C2613al.m7002a(newPullParser, strArr3[i]);
                                    if (a3 != null) {
                                        m = C58485gu.m89847o(new C3389b("image/jpeg", 0, 0), new C3389b(MediaUtilities.MIME_TYPE, Long.parseLong(a3), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (C2613al.m7007f(newPullParser, "Container:Directory")) {
                        m = m9814b(newPullParser, "Container", "Item");
                    } else if (C2613al.m7007f(newPullParser, "GContainer:Directory")) {
                        m = m9814b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!C2613al.m7005d(newPullParser, "x:xmpmeta"));
                if (m.isEmpty()) {
                    return null;
                }
                return new C3390c(j2, m);
            }
            throw C2599az.m6819a("Couldn't find xmp metadata", (Throwable) null);
        } catch (C2599az | NumberFormatException | XmlPullParserException unused) {
            C2633u.m7050e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static C58485gu m9814b(XmlPullParser xmlPullParser, String str, String str2) {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        C58480gp e = C58485gu.m89837e();
        do {
            xmlPullParser.next();
            if (C2613al.m7007f(xmlPullParser, concat)) {
                String a = C2613al.m7002a(xmlPullParser, str2.concat(":Mime"));
                String a2 = C2613al.m7002a(xmlPullParser, str2.concat(":Semantic"));
                String a3 = C2613al.m7002a(xmlPullParser, str2.concat(":Length"));
                String a4 = C2613al.m7002a(xmlPullParser, str2.concat(":Padding"));
                if (a == null || a2 == null) {
                    return C58485gu.m89845m();
                }
                e.mo55395g(new C3389b(a, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!C2613al.m7005d(xmlPullParser, concat2));
        return e.mo55394f();
    }
}
