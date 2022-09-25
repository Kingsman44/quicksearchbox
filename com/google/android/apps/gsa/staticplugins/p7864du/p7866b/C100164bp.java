package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118308af;
import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118336y;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.bp */
/* compiled from: PG */
public final class C100164bp {

    /* renamed from: a */
    private static final C100158bj f280081a = new C100161bm("blob");

    /* renamed from: b */
    private static final C100158bj f280082b = new C100161bm("expire");

    /* renamed from: c */
    private static final C100158bj f280083c = new C100161bm("_ID");

    /* renamed from: d */
    private static final C100158bj f280084d = new C100161bm("blob_key");

    /* renamed from: e */
    private static final C100158bj f280085e = new C100161bm("blob_path");

    /* renamed from: a */
    static long m165988a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: b */
    public static C100158bj m165989b(C118336y yVar, boolean z) {
        int c = yVar.mo103659c();
        int i = c - 1;
        if (c != 0) {
            switch (i) {
                case 0:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                    return new C100160bl(yVar, m165991d(c));
                case 1:
                case 4:
                case 6:
                case 8:
                case 10:
                    return new C100159bk(yVar, m165991d(c));
                case 11:
                    return f280081a;
                case 12:
                    return f280082b;
                case 13:
                    return f280083c;
                case 14:
                    return f280084d;
                case 15:
                    return f280085e;
                case 16:
                    return new C100162bn((C118327r) yVar, z);
                case 17:
                    return new C100163bo(C118308af.m196476j(m165988a(Boolean.parseBoolean(yVar.mo103656b()))));
                case 18:
                case 19:
                case 20:
                    return new C100163bo(yVar);
                case 21:
                    return new C100163bo(C118308af.m196479m("%" + yVar.mo103656b().replace("%", "\\%").replace("_", "\\_") + "%"));
                default:
                    throw new IllegalArgumentException("Invalid operand");
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    public static String m165990c(int i) {
        switch (i - 1) {
            case 1:
                return " AND ";
            case 2:
                return " OR ";
            case 3:
                return " NOT ";
            case 4:
                return " = ";
            case 5:
                return " != ";
            case 6:
                return " > ";
            case 7:
                return " >= ";
            case 8:
                return " < ";
            case 9:
                return " <= ";
            case 10:
                return ", ";
            case 11:
                return " IN ";
            default:
                return " AS ";
        }
    }

    /* renamed from: d */
    private static String m165991d(int i) {
        switch (i - 1) {
            case 0:
            case 1:
                return "attribute_id";
            case 2:
                return "blob_id";
            case 3:
            case 4:
                return "boolean_attribute_value";
            case 5:
            case 6:
                return "real_attribute_value";
            case 7:
            case 8:
                return "long_attribute_value";
            case 9:
            case 10:
                return "text_attribute_value";
            default:
                throw new IllegalStateException("Invalid operand type");
        }
    }
}
