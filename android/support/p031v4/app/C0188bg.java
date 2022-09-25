package android.support.p031v4.app;

import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import androidx.activity.result.C0815b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: android.support.v4.app.bg */
/* compiled from: PG */
final class C0188bg implements C0815b {

    /* renamed from: a */
    final /* synthetic */ FragmentManager f759a;

    public C0188bg(FragmentManager fragmentManager) {
        this.f759a = fragmentManager;
    }

    public final /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo) this.f759a.f655v.pollFirst();
        if (launchedFragmentInfo == null) {
            new StringBuilder("No permissions were requested for ").append(this);
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        String str = launchedFragmentInfo.f664a;
        int i2 = launchedFragmentInfo.f665b;
        Fragment d = this.f759a.f634a.mo672d(str);
        if (d == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            d.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }
}
