package org.chromium.weblayer;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0395p;
import android.view.MenuItem;

/* compiled from: PG */
public class SettingsActivity extends C0395p {

    /* renamed from: j */
    private static boolean f193092j;

    /* renamed from: k */
    private static SettingsActivity f193093k;

    /* renamed from: l */
    private boolean f193094l;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (!mo64431v()) {
            try {
                if (getPackageManager().getActivityInfo(getComponentName(), 0).exported) {
                    throw new IllegalStateException("SettingsActivity must not be exported.");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        super.onCreate(bundle);
        if (bundle == null) {
            z = true;
        }
        this.f193094l = z;
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        aqVar.f1215o.mo1239j(true);
        C0356aq aqVar2 = (C0356aq) mo1322k();
        aqVar2.mo1163P();
        aqVar2.f1215o.mo1227E();
        if (mo545jw().f634a.mo671c("settingsFragment") == null) {
            C72593bb bbVar = new C72593bb();
            bbVar.setArguments(getIntent().getExtras());
            C0154a aVar = new C0154a(mo545jw());
            aVar.mo511h(16908290, bbVar, "settingsFragment", 1);
            aVar.mo509f();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        SettingsActivity settingsActivity = f193093k;
        if (!(settingsActivity == null || settingsActivity.getTaskId() == getTaskId())) {
            if (this.f193094l) {
                f193093k.finish();
            } else {
                finish();
                return;
            }
        }
        f193093k = this;
        this.f193094l = false;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (f193093k == this) {
            f193093k = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo64431v() {
        boolean z = f193092j;
        f193092j = true;
        return z;
    }
}
