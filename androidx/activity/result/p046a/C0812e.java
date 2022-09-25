package androidx.activity.result.p046a;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C1882h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.activity.result.a.e */
/* compiled from: PG */
public final class C0812e extends C0809b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo613a(Context context, Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "input");
        return C0810c.m2660a(new String[]{str});
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo614b(int i, Intent intent) {
        boolean z = false;
        if (intent == null || i != -1) {
            return false;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0808a mo3368c(Context context, Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "input");
        if (C1882h.m5137c(context, str) == 0) {
            return new C0808a(true);
        }
        return null;
    }
}
