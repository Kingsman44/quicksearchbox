package com.google.android.apps.gsa.shared.util.debug;

import android.os.Trace;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.n */
/* compiled from: PG */
public final class C91030n {

    /* renamed from: a */
    private static final C59071e f254268a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.debug.n");

    /* renamed from: a */
    public static void m148695a(String str, C90476a aVar) {
        if (aVar.mo84225b()) {
            if (str.length() > 127) {
                str = str.substring(0, 126);
            }
            Trace.beginSection(str);
            return;
        }
        ((C59052c) ((C59052c) f254268a.mo56226d()).mo56372aa(11400)).mo56386p("beginSection() logging is called on the build that is not suitable for it.");
    }

    /* renamed from: b */
    public static void m148696b(C90476a aVar) {
        if (aVar.mo84225b()) {
            Trace.endSection();
        } else {
            ((C59052c) ((C59052c) f254268a.mo56226d()).mo56372aa(11401)).mo56386p("endSection() logging is called on the build that is not suitable for it.");
        }
    }
}
