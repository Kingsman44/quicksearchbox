package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.state.p6865b.C86831a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.common.base.C58838bb;
import dagger.C68214a;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.search.core.state.ii */
/* compiled from: PG */
public abstract class C87141ii implements C91007g, C86997dw {

    /* renamed from: a */
    private static final String[] f235450a = new String[0];

    /* renamed from: b */
    private static final C87739bu[] f235451b = new C87739bu[0];

    /* renamed from: J */
    public final int f235452J;

    /* renamed from: K */
    public boolean f235453K;

    /* renamed from: c */
    private final C68214a f235454c;

    protected C87141ii(C68214a aVar, int i, int i2, int i3) {
        new AtomicLong();
        m140837aq(i2, i3, i);
        this.f235452J = i;
        this.f235454c = aVar;
    }

    /* renamed from: an */
    protected static C87116hk m140834an(int i, int i2) {
        BitSet bitSet = new BitSet(250);
        bitSet.set(i, i2 + 1);
        return C87115hj.m140775a(bitSet);
    }

    /* renamed from: ao */
    protected static C87116hk m140835ao(int i, int i2, int... iArr) {
        BitSet bitSet = new BitSet(250);
        for (int i3 : iArr) {
            m140837aq(i, i2, i3);
            bitSet.set(i3);
        }
        return C87115hj.m140775a(bitSet);
    }

    /* renamed from: ap */
    public static void m140836ap(int i) {
        boolean z = false;
        if (i >= 0 && i <= 250) {
            z = true;
        }
        C58838bb.m90868c(z);
    }

    /* renamed from: aq */
    public static void m140837aq(int i, int i2, int i3) {
        boolean z = false;
        if (i <= i3 && i3 <= i2) {
            z = true;
        }
        C58838bb.m90868c(z);
    }

    /* renamed from: ag */
    public C87739bu[] mo80403ag() {
        return f235451b;
    }

    /* renamed from: am */
    public final int mo80627am() {
        return this.f235452J;
    }

    /* renamed from: ar */
    public void mo80591ar() {
        this.f235453K = true;
        ((C86831a) this.f235454c.mo27525b()).mo80528m(this.f235452J);
    }

    /* renamed from: hl */
    public void mo80592hl(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: hm */
    public void mo80709hm(Query query, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public void mo80406hn(C88432bc bcVar) {
    }

    /* renamed from: ho */
    public void mo80748ho() {
    }

    /* renamed from: hp */
    public String[] mo80593hp() {
        return f235450a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public void mo80407hq(C88433bd bdVar, int i) {
    }

    /* renamed from: hr */
    public void mo80408hr(long j, ClientEventData clientEventData) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public void mo80521hs(Bundle bundle) {
    }
}
