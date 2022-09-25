package com.google.android.libraries.assistant.soda;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.soda.aa */
/* compiled from: PG */
public final class C19238aa {

    /* renamed from: a */
    public static final C59071e f53913a = C59071e.m91332i("com.google.android.libraries.assistant.soda.aa");

    /* renamed from: b */
    public static final C58485gu f53914b = C58485gu.m89847o("/system/usr/srec", "/product/usr/srec");

    /* renamed from: a */
    public static boolean m36671a(String str) {
        try {
            String[] list = new File(str).list();
            if (list == null || list.length == 0) {
                return true;
            }
            return false;
        } catch (SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f53913a.mo56226d()).mo56382g(e)).mo56372aa(47663)).mo56389s("Read access to the directory is denied: %s", str);
            return true;
        }
    }
}
