package com.google.android.libraries.home.p1958f.p1959a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18511b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18512c;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.snackbar.Snackbar;
import com.google.assistant.p3861at.C50179nm;
import com.google.assistant.p3861at.C50181no;
import com.google.assistant.p3861at.C50196oc;
import com.google.assistant.p3861at.acz;
import com.google.assistant.p3861at.aet;
import com.google.common.android.concurrent.C58281f;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.CancellationException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.u */
/* compiled from: PG */
public final class C23806u extends C58281f {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65220a;

    public C23806u(C23782ah ahVar) {
        this.f65220a = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo29126a(Object obj, Throwable th) {
        C62722b bVar;
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        C69664n.m101061g(th, C42181t.f110467a);
        if (parcelableProto != null) {
            this.f65220a.mo29132r();
            C18512c cVar = null;
            if (th instanceof CancellationException) {
                bVar = C62722b.CANCELLED;
            } else {
                bVar = C62722b.UNAVAILABLE;
                Snackbar.m79661q((Context) null, this.f65220a.requireView(), this.f65220a.getString(R.string.error_snackbar, C23800o.m44333a(parcelableProto).f130447b), -1).mo48343h();
            }
            this.f65220a.mo29136v(bVar, parcelableProto);
            C18512c cVar2 = this.f65220a.f65164g;
            if (cVar2 == null) {
                C69664n.m101065k("accountLinkingFlow");
            } else {
                cVar = cVar2;
            }
            if (C18511b.m35979a(cVar.f52466a) == 3) {
                this.f65220a.mo29134t(0, C23800o.m44333a(parcelableProto));
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29127b(Object obj, Object obj2) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        ProtoParsers.ParcelableProto parcelableProto2 = (ProtoParsers.ParcelableProto) obj2;
        if (parcelableProto == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (parcelableProto2 != null) {
            this.f65220a.mo29132r();
            aet aet = (aet) parcelableProto2.mo58938a(aet.f129130d, C62921ba.m95368a());
            int a = C50179nm.m85783a(C23800o.m44333a(parcelableProto).f130449d);
            C18512c cVar = null;
            if (a == 0 || a != 2) {
                acz acz = aet.f129134c;
                if (acz == null) {
                    acz = acz.f129010n;
                }
                C50196oc ocVar = acz.f129016e;
                if (ocVar == null) {
                    ocVar = C50196oc.f130490b;
                }
                if (ocVar.f130492a) {
                    this.f65220a.mo29136v(C62722b.NOT_FOUND, parcelableProto);
                    C23782ah ahVar = this.f65220a;
                    C50181no a2 = C23800o.m44333a(parcelableProto);
                    C69664n.m101061g(a2, "provider");
                    C23786al alVar = new C23786al();
                    Bundle bundle = new Bundle(1);
                    C23787b.m44307b(bundle, a2);
                    alVar.setArguments(bundle);
                    alVar.showNow(ahVar.getParentFragmentManager(), (String) null);
                    return;
                }
            }
            this.f65220a.mo29136v(C62722b.OK, parcelableProto);
            Snackbar.m79661q((Context) null, this.f65220a.requireView(), this.f65220a.getString(R.string.link_success_snackbar, C23800o.m44333a(parcelableProto).f130447b), -1).mo48343h();
            C18512c cVar2 = this.f65220a.f65164g;
            if (cVar2 == null) {
                C69664n.m101065k("accountLinkingFlow");
                cVar2 = null;
            }
            if (C18511b.m35979a(cVar2.f52466a) != 3) {
                C18512c cVar3 = this.f65220a.f65164g;
                if (cVar3 == null) {
                    C69664n.m101065k("accountLinkingFlow");
                } else {
                    cVar = cVar3;
                }
                if (C18511b.m35979a(cVar.f52466a) != 2) {
                    this.f65220a.mo29138x();
                    return;
                }
            }
            this.f65220a.mo29134t(-1, C23800o.m44333a(parcelableProto));
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
