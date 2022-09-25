package com.google.apps.tiktok.cache;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import androidx.savedstate.C4088d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.cache.ParcelableKeyValueStore;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class InstanceStateStoreFactory {

    /* renamed from: a */
    public final Object f121352a = new Object();

    /* renamed from: b */
    public final Map f121353b = new HashMap();

    /* renamed from: c */
    private final Map f121354c = new HashMap();

    /* renamed from: d */
    private final C21370a f121355d;

    /* renamed from: e */
    private final C62921ba f121356e;

    /* renamed from: f */
    private final Fragment f121357f;

    public InstanceStateStoreFactory(C21370a aVar, C62921ba baVar, final Fragment fragment) {
        this.f121355d = aVar;
        this.f121356e = baVar;
        this.f121357f = fragment;
        fragment.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                synchronized (InstanceStateStoreFactory.this.f121352a) {
                    for (Map.Entry entry : InstanceStateStoreFactory.this.f121353b.entrySet()) {
                        InstanceStateStoreFactory.this.mo50326b((String) entry.getKey(), (C46401p) entry.getValue());
                    }
                    InstanceStateStoreFactory.this.f121353b.clear();
                }
                fragment.getLifecycle().mo5791c(this);
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: a */
    public final C46401p mo50325a(String str, MessageLite messageLite) {
        C46401p pVar;
        synchronized (this.f121352a) {
            pVar = (C46401p) this.f121354c.get(str);
            if (pVar == null) {
                pVar = new C46401p(this.f121355d, messageLite, this.f121356e);
                if (this.f121357f.getLifecycle().mo5789a().mo5788a(C2383n.CREATED)) {
                    mo50326b(str, pVar);
                } else {
                    this.f121353b.put(str, pVar);
                }
                this.f121354c.put(str, pVar);
            }
        }
        return pVar;
    }

    /* renamed from: b */
    public final void mo50326b(String str, C46401p pVar) {
        ParcelableKeyValueStore parcelableKeyValueStore;
        C4088d savedStateRegistry = this.f121357f.getSavedStateRegistry();
        Bundle a = savedStateRegistry.mo8584a(str);
        if (a != null) {
            Parcelable parcelable = a.getParcelable("com.google.apps.tiktok.cache.InstanceStateStore");
            if (parcelable instanceof ParcelableKeyValueStore) {
                parcelableKeyValueStore = (ParcelableKeyValueStore) parcelable;
                savedStateRegistry.mo8585b(str, new C46402q(parcelableKeyValueStore));
                MessageLite messageLite = pVar.f121456b;
                C62921ba baVar = pVar.f121457c;
                parcelableKeyValueStore.f121362c = messageLite;
                parcelableKeyValueStore.f121363d = baVar;
                pVar.f121458d = parcelableKeyValueStore;
            }
        }
        parcelableKeyValueStore = new ParcelableKeyValueStore(new ParcelableKeyValueStore.ParcelableEntry[0]);
        savedStateRegistry.mo8585b(str, new C46402q(parcelableKeyValueStore));
        MessageLite messageLite2 = pVar.f121456b;
        C62921ba baVar2 = pVar.f121457c;
        parcelableKeyValueStore.f121362c = messageLite2;
        parcelableKeyValueStore.f121363d = baVar2;
        pVar.f121458d = parcelableKeyValueStore;
    }
}
