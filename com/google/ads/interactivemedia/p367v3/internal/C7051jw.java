package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jw */
/* compiled from: PG */
public final class C7051jw implements C7058kc {

    /* renamed from: a */
    private static final int[] f22585a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7};

    /* renamed from: b */
    private static final Constructor f22586b;

    /* renamed from: c */
    private final int f22587c = 1;

    /* renamed from: d */
    private final int f22588d = 112800;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.ext.flac.FlacExtractor").asSubclass(C7053jy.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f22586b = constructor;
    }

    /* renamed from: c */
    private final void m20921c(int i, List list) {
        switch (i) {
            case 0:
                list.add(new C7159nw());
                return;
            case 1:
                list.add(new C7162nz());
                return;
            case 2:
                list.add(new C7166oc((byte[]) null));
                return;
            case 3:
                list.add(new C7079kx((byte[]) null));
                return;
            case 4:
                Constructor constructor = f22586b;
                if (constructor != null) {
                    try {
                        list.add((C7053jy) constructor.newInstance(new Object[]{0}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                } else {
                    list.add(new C7085lc((byte[]) null));
                    return;
                }
            case 5:
                list.add(new C7088lf());
                return;
            case 6:
                list.add(new C7100lr(0));
                return;
            case 7:
                list.add(new C7107ly((byte[]) null));
                return;
            case 8:
                list.add(new C7128ms((byte[]) null));
                list.add(new C7133mx((byte[]) null));
                return;
            case 9:
                list.add(new C7147nk());
                return;
            case 10:
                list.add(new C7193pc());
                return;
            case 11:
                list.add(new C7203pm(1, 112800));
                return;
            case 12:
                list.add(new C7214px());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final synchronized C7053jy[] mo15118a() {
        return mo15119b(Uri.EMPTY, new HashMap());
    }

    /* renamed from: b */
    public final synchronized C7053jy[] mo15119b(Uri uri, Map map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int p = aqd.m19288p(map);
        if (p != -1) {
            m20921c(p, arrayList);
        }
        int r = aqd.m19290r(uri);
        if (!(r == -1 || r == p)) {
            m20921c(r, arrayList);
        }
        int[] iArr = f22585a;
        int length = iArr.length;
        for (int i = 0; i < 13; i++) {
            int i2 = iArr[i];
            if (!(i2 == p || i2 == r)) {
                m20921c(i2, arrayList);
            }
        }
        return (C7053jy[]) arrayList.toArray(new C7053jy[arrayList.size()]);
    }
}
