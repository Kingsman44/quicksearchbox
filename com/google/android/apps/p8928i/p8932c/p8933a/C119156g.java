package com.google.android.apps.p8928i.p8932c.p8933a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.p8928i.p8929a.p8930a.C119148d;
import com.google.android.apps.p8928i.p8932c.p8935c.C119163a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.i.c.a.g */
/* compiled from: PG */
public final class C119156g {
    static {
        C58528ij.m90011K("mailto", "tel");
    }

    /* renamed from: a */
    public static Intent m197867a(C119155f fVar, Context context) {
        String str;
        C58833ax k = C58833ax.m90834k(context);
        Intent intent = new Intent("com.google.android.apps.tachyon.action.CALL");
        intent.setPackage("com.google.android.apps.tachyon");
        C119158i a = fVar.mo104211a();
        int b = a.mo104220b();
        int i = b - 1;
        if (b != 0) {
            if (i == 0) {
                str = "mailto";
            } else if (i == 1) {
                str = "tel";
            } else {
                throw new IllegalArgumentException("Unreachable code");
            }
            intent.setData(Uri.parse(String.format("%s:%s", new Object[]{str, a.mo104219a()})));
            intent.putExtra(C119163a.f332339a, fVar.mo104213c());
            if (fVar.mo104212b().mo56113h()) {
                intent.putExtra(C119163a.f332340b, ((C119148d) fVar.mo104212b().mo56107c()).toByteArray());
            }
            Intent intent2 = new Intent(intent);
            intent2.setPackage("com.google.android.apps.tachyon");
            intent.putExtra(C119163a.f332341c, PendingIntent.getActivity((Context) ((C58847bk) k).f156646a, 0, intent2, 67108864));
            return intent;
        }
        throw null;
    }
}
