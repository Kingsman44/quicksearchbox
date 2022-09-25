package android.support.p031v4.app;

import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;

/* renamed from: android.support.v4.app.be */
/* compiled from: PG */
final class C0186be implements C0815b {

    /* renamed from: a */
    final /* synthetic */ FragmentManager f757a;

    public C0186be(FragmentManager fragmentManager) {
        this.f757a = fragmentManager;
    }

    public final /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo) this.f757a.f655v.pollFirst();
        if (launchedFragmentInfo == null) {
            new StringBuilder("No Activities were started for result for ").append(this);
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        String str = launchedFragmentInfo.f664a;
        int i = launchedFragmentInfo.f665b;
        Fragment d = this.f757a.f634a.mo672d(str);
        if (d == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            d.onActivityResult(i, activityResult.f2755a, activityResult.f2756b);
        }
    }
}
