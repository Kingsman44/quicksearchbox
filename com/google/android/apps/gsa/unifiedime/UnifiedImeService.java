package com.google.android.apps.gsa.unifiedime;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

@Deprecated
/* compiled from: PG */
public class UnifiedImeService extends C118592j {

    /* renamed from: a */
    public static final C59071e f330813a = C59071e.m91332i("com.google.android.apps.gsa.unifiedime.UnifiedImeService");

    /* renamed from: b */
    public C69464a f330814b;

    /* renamed from: c */
    public C68214a f330815c;

    /* renamed from: d */
    public C68214a f330816d;

    /* renamed from: e */
    public C118579ac f330817e;

    public final IBinder onBind(Intent intent) {
        ((C59052c) ((C59052c) f330813a.mo56224b()).mo56372aa(34046)).mo56386p("#onBind");
        if (this.f330817e == null) {
            this.f330817e = (C118579ac) this.f330814b.mo17428b();
        }
        this.f330817e.mo103765c();
        this.f330817e.f330836q = Objects.equals(intent.getStringExtra("vime-to-uni"), "vime-to-uni");
        return new C118580ad(this);
    }

    public final void onCreate() {
        C74507e.m120466b(36);
        ((C59052c) ((C59052c) f330813a.mo56224b()).mo56372aa(34047)).mo56386p("#onCreate");
        super.onCreate();
    }

    public final boolean onUnbind(Intent intent) {
        C118579ac acVar = this.f330817e;
        if (acVar == null) {
            return false;
        }
        acVar.mo103764b();
        this.f330817e.mo103765c();
        return false;
    }
}
