package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqd */
/* compiled from: PG */
public final class aqd {
    /* renamed from: a */
    public static String m19273a(String str) {
        if (aqb.m19270a(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m19274b(String str) {
        return aqb.m19270a(str);
    }

    /* renamed from: c */
    public static String m19275c(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb2.length() != 0 ? "Exception during lenientFormat for ".concat(sb2) : new String("Exception during lenientFormat for "), e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 9 + String.valueOf(name2).length());
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb4.append(str, i3, str.length());
            } else {
                sb4.append(str, i3, indexOf);
                sb4.append(objArr[i]);
                i3 = indexOf + 2;
                i++;
            }
        }
        sb4.append(str, i3, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb4.append(", ");
                sb4.append(objArr[i4]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* renamed from: d */
    public static void m19276d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m19277e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: f */
    public static void m19278f(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m19275c(str, obj));
        }
    }

    /* renamed from: g */
    public static void m19279g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: h */
    public static void m19280h(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m19293u(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m19293u(i2, i3, "end index");
            } else {
                str = m19275c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: i */
    public static void m19281i(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = m19275c("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str = m19275c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: j */
    public static void m19282j(Object obj) {
        obj.getClass();
    }

    /* renamed from: k */
    public static void m19283k(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* renamed from: l */
    public static void m19284l(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m19293u(i, i2, "index"));
        }
    }

    /* renamed from: m */
    public static int[] m19285m(Collection collection) {
        if (!(collection instanceof asu)) {
            Object[] array = collection.toArray();
            int length = array.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                Object obj = array[i];
                m19282j(obj);
                iArr[i] = ((Number) obj).intValue();
            }
            return iArr;
        }
        asu asu = (asu) collection;
        throw null;
    }

    /* renamed from: n */
    public static int m19286n(int i, int i2) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* renamed from: o */
    public static int m19287o(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19288p(java.util.Map r2) {
        /*
            java.lang.String r0 = "Content-Type"
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            if (r2 == 0) goto L_0x001a
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
        L_0x001a:
            int r2 = m19289q(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aqd.m19288p(java.util.Map):int");
    }

    /* renamed from: q */
    public static int m19289q(String str) {
        if (str == null) {
            return -1;
        }
        String k = adz.m18359k(str);
        switch (k.hashCode()) {
            case -2123537834:
                if (k.equals("audio/eac3-joc")) {
                    return 0;
                }
                break;
            case -1662384011:
                if (k.equals("video/mp2p")) {
                    return 10;
                }
                break;
            case -1662384007:
                if (k.equals("video/mp2t")) {
                    return 11;
                }
                break;
            case -1662095187:
                if (k.equals("video/webm")) {
                    return 6;
                }
                break;
            case -1606874997:
                if (k.equals("audio/amr-wb")) {
                    return 3;
                }
                break;
            case -1248337486:
                if (k.equals("application/mp4")) {
                    return 8;
                }
                break;
            case -1004728940:
                if (k.equals("text/vtt")) {
                    return 13;
                }
                break;
            case -387023398:
                if (k.equals("audio/x-matroska")) {
                    return 6;
                }
                break;
            case -43467528:
                if (k.equals("application/webm")) {
                    return 6;
                }
                break;
            case 13915911:
                if (k.equals("video/x-flv")) {
                    return 5;
                }
                break;
            case 187078296:
                if (k.equals("audio/ac3")) {
                    return 0;
                }
                break;
            case 187078297:
                if (k.equals("audio/ac4")) {
                    return 1;
                }
                break;
            case 187078669:
                if (k.equals("audio/amr")) {
                    return 3;
                }
                break;
            case 187090232:
                if (k.equals("audio/mp4")) {
                    return 8;
                }
                break;
            case 187091926:
                if (k.equals("audio/ogg")) {
                    return 9;
                }
                break;
            case 187099443:
                if (k.equals("audio/wav")) {
                    return 12;
                }
                break;
            case 1331848029:
                if (k.equals(MediaUtilities.MIME_TYPE)) {
                    return 8;
                }
                break;
            case 1503095341:
                if (k.equals("audio/3gpp")) {
                    return 3;
                }
                break;
            case 1504578661:
                if (k.equals("audio/eac3")) {
                    return 0;
                }
                break;
            case 1504619009:
                if (k.equals("audio/flac")) {
                    return 4;
                }
                break;
            case 1504831518:
                if (k.equals("audio/mpeg")) {
                    return 7;
                }
                break;
            case 1505118770:
                if (k.equals("audio/webm")) {
                    return 6;
                }
                break;
            case 2039520277:
                if (k.equals("video/x-matroska")) {
                    return 6;
                }
                break;
        }
        return -1;
    }

    /* renamed from: r */
    public static int m19290r(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(MediaUtilities.VIDEO_FILE_EXTENSION) || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(MediaUtilities.VIDEO_FILE_EXTENSION, lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return -1;
    }

    /* renamed from: s */
    public static acb m19291s(C7426xt xtVar, C7423xq xqVar, int i) {
        aca aca = new aca();
        aca.mo14431g(xqVar.mo16776a(xtVar.f24345c));
        aca.mo14430f(xqVar.f24336a);
        aca.mo14429e(xqVar.f24337b);
        aca.mo14428d(xtVar.mo16784m());
        aca.mo14426b(i);
        return aca.mo14425a();
    }

    /* renamed from: t */
    public static C7356vd m19292t(C7356vd... vdVarArr) {
        return new C7300tb(vdVarArr);
    }

    /* renamed from: u */
    private static String m19293u(int i, int i2, String str) {
        if (i < 0) {
            return m19275c("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m19275c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
