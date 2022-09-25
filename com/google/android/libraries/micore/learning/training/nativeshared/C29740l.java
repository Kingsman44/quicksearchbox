package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4552o.p4554b.p4555a.C59611ag;
import com.google.common.p4552o.p4554b.p4555a.C59616al;
import com.google.common.p4552o.p4554b.p4555a.C59619ao;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.l */
/* compiled from: PG */
public final /* synthetic */ class C29740l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29742n f80517a;

    /* renamed from: b */
    public final /* synthetic */ int f80518b;

    /* renamed from: c */
    public final /* synthetic */ int f80519c;

    /* renamed from: d */
    public final /* synthetic */ int f80520d;

    /* renamed from: e */
    public final /* synthetic */ int f80521e;

    /* renamed from: f */
    public final /* synthetic */ String f80522f;

    /* renamed from: g */
    public final /* synthetic */ long f80523g;

    public /* synthetic */ C29740l(C29742n nVar, int i, int i2, int i3, int i4, String str, long j) {
        this.f80517a = nVar;
        this.f80518b = i;
        this.f80519c = i2;
        this.f80520d = i3;
        this.f80521e = i4;
        this.f80522f = str;
        this.f80523g = j;
    }

    public final void run() {
        int i;
        C29742n nVar = this.f80517a;
        int i2 = this.f80518b;
        int i3 = this.f80519c;
        int i4 = this.f80520d;
        int i5 = this.f80521e;
        String str = this.f80522f;
        long j = this.f80523g;
        switch (i2) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            default:
                switch (i2) {
                    case 100001:
                        i = 100003;
                        break;
                    case 100002:
                        i = 100004;
                        break;
                    case 100003:
                        i = 100005;
                        break;
                    case 100004:
                        i = 100006;
                        break;
                    case 100005:
                        i = 100007;
                        break;
                    case 100006:
                        i = 100008;
                        break;
                    case 100007:
                        i = 100009;
                        break;
                    case 100008:
                        i = 100010;
                        break;
                    case 100009:
                        i = 100011;
                        break;
                    case 100010:
                        i = 100012;
                        break;
                    case 100011:
                        i = 100013;
                        break;
                    case 100012:
                        i = 100014;
                        break;
                    default:
                        switch (i2) {
                            case 200001:
                                i = 200003;
                                break;
                            case 200002:
                                i = 200004;
                                break;
                            case 200003:
                                i = 200005;
                                break;
                            case 200004:
                                i = 200006;
                                break;
                            case 200005:
                                i = 200007;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                }
        }
        if (i != 0) {
            int a = C59616al.m92467a(i3);
            if (a != 0) {
                C59619ao aoVar = nVar.f80528c.f159877c;
                if (aoVar == null) {
                    aoVar = C59619ao.f159847l;
                }
                C59611ag agVar = (C59611ag) aoVar.toBuilder();
                agVar.copyOnWrite();
                C59619ao aoVar2 = (C59619ao) agVar.instance;
                aoVar2.f159849a |= 32;
                aoVar2.f159853e = i4;
                agVar.copyOnWrite();
                C59619ao aoVar3 = (C59619ao) agVar.instance;
                aoVar3.f159849a |= 64;
                aoVar3.f159854f = i5;
                agVar.copyOnWrite();
                C59619ao aoVar4 = (C59619ao) agVar.instance;
                aoVar4.f159859k = a - 1;
                aoVar4.f159849a |= C89885b.HTTP_VALUE;
                if (str != null) {
                    agVar.copyOnWrite();
                    C59619ao aoVar5 = (C59619ao) agVar.instance;
                    aoVar5.f159849a |= 4096;
                    aoVar5.f159857i = str;
                }
                C59627g gVar = (C59627g) nVar.f80528c.toBuilder();
                gVar.copyOnWrite();
                C59628h hVar = (C59628h) gVar.instance;
                C59619ao aoVar6 = (C59619ao) agVar.build();
                aoVar6.getClass();
                hVar.f159877c = aoVar6;
                hVar.f159875a |= 4;
                nVar.f80526a.mo120054f(i, (C59628h) gVar.build(), j);
                return;
            }
            throw null;
        }
        throw null;
    }
}
