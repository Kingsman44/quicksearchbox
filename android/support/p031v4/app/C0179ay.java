package android.support.p031v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.C4087c;

/* renamed from: android.support.v4.app.ay */
/* compiled from: PG */
public final /* synthetic */ class C0179ay implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f752a;

    public /* synthetic */ C0179ay(FragmentManager fragmentManager) {
        this.f752a = fragmentManager;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        FragmentManager fragmentManager = this.f752a;
        Bundle bundle = new Bundle();
        Parcelable c = fragmentManager.mo472c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        return bundle;
    }
}
