package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.content.Context;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36680d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3861at.C50004h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.o */
/* compiled from: PG */
public final class C126674o {

    /* renamed from: a */
    public static final C59071e f348826a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.oobe.o");

    /* renamed from: b */
    public final Context f348827b;

    /* renamed from: c */
    public final C47770dh f348828c;

    /* renamed from: d */
    public final C46801dp f348829d;

    /* renamed from: e */
    public final C46439e f348830e;

    /* renamed from: f */
    public final C126669j f348831f;

    /* renamed from: g */
    public final String f348832g;

    /* renamed from: h */
    public final C37215b f348833h;

    /* renamed from: i */
    public final AccountId f348834i;

    /* renamed from: j */
    public final C28306ab f348835j;

    /* renamed from: k */
    public final C28310af f348836k;

    /* renamed from: l */
    public final C28443m f348837l;

    /* renamed from: m */
    public final C36680d f348838m;

    /* renamed from: n */
    public final C126677c f348839n = new C126677c();

    /* renamed from: o */
    public final C126675a f348840o = new C126675a();

    /* renamed from: p */
    public final C126676b f348841p = new C126676b();

    /* renamed from: q */
    final C36624a f348842q;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.o$a */
    /* compiled from: PG */
    final class C126675a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C126674o.f348826a.mo56225c()).mo56382g(th)).mo56372aa(37086)).mo56386p("Failed to update screen interaction counter for OOBE GetMoreScreen.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.o$b */
    /* compiled from: PG */
    final class C126676b implements C46440f {
        public C126676b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C126674o.f348826a.mo56225c()).mo56382g(th)).mo56372aa(37088)).mo56386p("Failed to update email opt-in setting");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C50004h hVar = (C50004h) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C50004h.f129989d, C62921ba.m95368a());
            if ((hVar.f129991a & 2) != 0) {
                Snackbar.m79661q((Context) null, C126674o.this.f348831f.requireView(), hVar.f129993c, 0).mo48343h();
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.o$c */
    /* compiled from: PG */
    final class C126677c implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C126674o.f348826a.mo56225c()).mo56382g(th)).mo56372aa(37090)).mo56386p("Failed to update all user Opt-In preferences in OOBE GetMoreScreen.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C126674o(AccountId accountId, C126669j jVar, String str, C46801dp dpVar, C46439e eVar, C37215b bVar, C36624a aVar, C36680d dVar, C47770dh dhVar, C28306ab abVar, C28310af afVar, C28443m mVar) {
        this.f348834i = accountId;
        this.f348827b = jVar.getContext();
        this.f348831f = jVar;
        this.f348832g = str;
        this.f348838m = dVar;
        this.f348829d = dpVar;
        this.f348830e = eVar;
        this.f348833h = bVar;
        this.f348842q = aVar;
        this.f348828c = dhVar;
        this.f348835j = abVar;
        this.f348836k = afVar;
        this.f348837l = mVar;
    }
}
