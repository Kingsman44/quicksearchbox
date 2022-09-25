package androidx.core.p098j;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: androidx.core.j.bf */
/* compiled from: PG */
final class C2040bf {
    /* renamed from: a */
    public static C2096k m5503a(View view, C2096k kVar) {
        ContentInfo a = kVar.mo5268a();
        ContentInfo performReceiveContent = view.performReceiveContent(a);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == a) {
            return kVar;
        }
        return C2096k.m5775b(performReceiveContent);
    }

    /* renamed from: b */
    public static void m5504b(View view, String[] strArr, C2011ae aeVar) {
        if (aeVar == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new C2041bg(aeVar));
        }
    }

    /* renamed from: c */
    public static String[] m5505c(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
