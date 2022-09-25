package com.google.android.libraries.search.video.players;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* compiled from: PG */
public final class PlayerWrapperImpl {

    /* renamed from: a */
    public static final C59071e f108578a = C59071e.m91332i("com.google.android.libraries.search.video.players.PlayerWrapperImpl");

    /* renamed from: b */
    public final C46440f f108579b = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Integer num = (Integer) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            Consumer consumer = (Consumer) PlayerWrapperImpl.this.f108581d.get((Integer) obj);
            if (consumer != null) {
                consumer.accept(bool);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: c */
    public final C2390u f108580c = new C2376g() {
        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            ((C59052c) ((C59052c) PlayerWrapperImpl.f108578a.mo56224b()).mo56372aa(53903)).mo56386p("OnCreate Was Called");
            PlayerWrapperImpl playerWrapperImpl = PlayerWrapperImpl.this;
            playerWrapperImpl.f108582e.mo50429i(playerWrapperImpl.f108579b);
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
    };

    /* renamed from: d */
    public final Map f108581d;

    /* renamed from: e */
    public final C46439e f108582e;

    /* renamed from: f */
    private int f108583f;

    public PlayerWrapperImpl(C46439e eVar) {
        ((C59052c) ((C59052c) f108578a.mo56224b()).mo56372aa(53904)).mo56386p("Constructor was called");
        this.f108582e = eVar;
        this.f108581d = new HashMap();
    }

    /* renamed from: a */
    public final C41592w mo44064a(C41592w wVar, Supplier supplier) {
        if (wVar == null) {
            return null;
        }
        int i = this.f108583f;
        this.f108583f = i + 1;
        return new C41571f(this, Integer.valueOf(i), wVar, supplier);
    }
}
