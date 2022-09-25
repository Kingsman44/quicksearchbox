package com.google.android.libraries.home.p1958f.p1959a;

import android.content.Context;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18511b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18512c;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.android.concurrent.C58281f;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.ag */
/* compiled from: PG */
public final class C23781ag extends C58281f {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65160a;

    public C23781ag(C23782ah ahVar) {
        this.f65160a = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo29126a(Object obj, Throwable th) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        C69664n.m101061g(th, C42181t.f110467a);
        if (parcelableProto != null) {
            this.f65160a.mo29132r();
            C18512c cVar = null;
            Snackbar.m79661q((Context) null, this.f65160a.requireView(), this.f65160a.getString(R.string.error_snackbar, C23800o.m44333a(parcelableProto).f130447b), -1).mo48343h();
            C18512c cVar2 = this.f65160a.f65164g;
            if (cVar2 == null) {
                C69664n.m101065k("accountLinkingFlow");
            } else {
                cVar = cVar2;
            }
            if (C18511b.m35979a(cVar.f52466a) == 4) {
                this.f65160a.mo29134t(0, C23800o.m44333a(parcelableProto));
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29127b(Object obj, Object obj2) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        Void voidR = (Void) obj2;
        if (parcelableProto != null) {
            this.f65160a.mo29132r();
            View requireView = this.f65160a.requireView();
            String string = this.f65160a.getString(R.string.unlink_success_snackbar, C23800o.m44333a(parcelableProto).f130447b);
            C18512c cVar = null;
            Snackbar.m79661q((Context) null, requireView, string, -1).mo48343h();
            C18512c cVar2 = this.f65160a.f65164g;
            if (cVar2 == null) {
                C69664n.m101065k("accountLinkingFlow");
            } else {
                cVar = cVar2;
            }
            if (C18511b.m35979a(cVar.f52466a) == 4) {
                this.f65160a.mo29134t(-1, C23800o.m44333a(parcelableProto));
            } else {
                this.f65160a.mo29138x();
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
