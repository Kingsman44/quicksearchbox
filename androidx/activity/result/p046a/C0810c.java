package androidx.activity.result.p046a;

import android.content.Intent;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.activity.result.a.c */
/* compiled from: PG */
public final class C0810c {
    /* renamed from: a */
    public static final Intent m2660a(String[] strArr) {
        C69664n.m101061g(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C69664n.m101060f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }
}
