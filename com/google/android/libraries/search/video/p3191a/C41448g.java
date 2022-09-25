package com.google.android.libraries.search.video.p3191a;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2390u;
import com.google.common.p4526f.C59052c;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.search.video.a.g */
/* compiled from: PG */
public final class C41448g {

    /* renamed from: a */
    private final Fragment f108257a;

    /* renamed from: b */
    private final Set f108258b;

    /* renamed from: c */
    private final C41452k f108259c;

    /* renamed from: d */
    private boolean f108260d;

    public C41448g(Fragment fragment, Set set, C41452k kVar) {
        this.f108257a = fragment;
        this.f108258b = set;
        this.f108259c = kVar;
    }

    /* renamed from: a */
    public final void mo43980a(C41450i iVar) {
        if (!this.f108260d) {
            C41452k kVar = this.f108259c;
            iVar.getClass();
            AtomicReference atomicReference = kVar.f108264b;
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, iVar)) {
                    if (atomicReference.get() != null) {
                        ((C59052c) ((C59052c) C41452k.f108263a.mo56226d()).mo56372aa(53891)).mo56386p("VideoOptionsProvider is already initialized");
                        break;
                    }
                } else {
                    break;
                }
            }
            for (C2390u b : this.f108258b) {
                this.f108257a.getLifecycle().mo5790b(b);
            }
            this.f108260d = true;
        }
    }
}
