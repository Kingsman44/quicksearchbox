package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.p060c.C0977g;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.gms.common.api.internal.ca */
/* compiled from: PG */
public final class C143780ca extends Fragment implements C143777by {

    /* renamed from: a */
    public static final WeakHashMap f389797a = new WeakHashMap();

    /* renamed from: b */
    public int f389798b = 0;

    /* renamed from: c */
    public Bundle f389799c;

    /* renamed from: d */
    private final Map f389800d = DesugarCollections.synchronizedMap(new C0977g());

    /* renamed from: a */
    public final Activity mo119218a() {
        return getActivity();
    }

    /* renamed from: b */
    public final void mo119219b(LifecycleCallback lifecycleCallback) {
        if (!this.f389800d.containsKey("ConnectionlessLifecycleHelper")) {
            this.f389800d.put("ConnectionlessLifecycleHelper", lifecycleCallback);
            if (this.f389798b > 0) {
                new C144861c(Looper.getMainLooper()).post(new C143778bz(this, lifecycleCallback));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    /* renamed from: c */
    public final LifecycleCallback mo119220c(Class cls) {
        return (LifecycleCallback) cls.cast(this.f389800d.get("ConnectionlessLifecycleHelper"));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f389800d.values()) {
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback c : this.f389800d.values()) {
            c.mo119115c(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f389798b = 1;
        this.f389799c = bundle;
        for (Map.Entry entry : this.f389800d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo119116d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f389798b = 5;
        for (LifecycleCallback lifecycleCallback : this.f389800d.values()) {
        }
    }

    public final void onResume() {
        super.onResume();
        this.f389798b = 3;
        for (LifecycleCallback h : this.f389800d.values()) {
            h.mo119118h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f389800d.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo119117g(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f389798b = 2;
        for (LifecycleCallback i : this.f389800d.values()) {
            i.mo119119i();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f389798b = 4;
        for (LifecycleCallback j : this.f389800d.values()) {
            j.mo119120j();
        }
    }
}
