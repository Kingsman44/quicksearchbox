package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

/* renamed from: androidx.core.app.aw */
/* compiled from: PG */
public final class C1806aw {
    /* renamed from: a */
    public static RemoteInput m4967a(C1811ba baVar) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(baVar.f5636a).setLabel(baVar.f5637b).setChoices(baVar.f5638c).setAllowFreeFormInput(baVar.f5639d).addExtras(baVar.f5641f);
        Set<String> set = baVar.f5642g;
        if (set != null) {
            for (String a : set) {
                C1807ax.m4970a(addExtras, a, true);
            }
        }
        C1808ay.m4975b(addExtras, baVar.f5640e);
        return addExtras.build();
    }

    /* renamed from: b */
    public static Bundle m4968b(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    /* renamed from: c */
    public static void m4969c(Object obj, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
    }
}
