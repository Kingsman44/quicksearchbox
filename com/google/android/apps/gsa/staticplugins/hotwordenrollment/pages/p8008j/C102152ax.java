package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ax */
/* compiled from: PG */
public final class C102152ax {

    /* renamed from: a */
    public static final C59071e f284970a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ax");

    /* renamed from: b */
    public final C102150av f284971b;

    /* renamed from: c */
    public final C46801dp f284972c;

    /* renamed from: d */
    public final C46723bg f284973d;

    /* renamed from: e */
    public final C74555u f284974e;

    /* renamed from: f */
    public final C46128f f284975f;

    /* renamed from: g */
    public final C101497ae f284976g;

    /* renamed from: h */
    public final String f284977h;

    /* renamed from: i */
    public final C101495ac f284978i;

    /* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ax$a */
    /* compiled from: PG */
    final class C102153a implements C46792di {
        public C102153a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C102152ax.f284970a.mo56225c()).mo56382g(th)).mo56372aa(20594)).mo56386p("Failed to get account id.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            AccountId accountId = (AccountId) obj;
            FragmentManager childFragmentManager = C102152ax.this.f284971b.getChildFragmentManager();
            if (C102152ax.this.mo92914a() == null) {
                C102167bk bkVar = (C102167bk) C102168bl.f285013f.createBuilder();
                String str = C102152ax.this.f284977h;
                bkVar.copyOnWrite();
                C102168bl blVar = (C102168bl) bkVar.instance;
                str.getClass();
                blVar.f285015a |= 1;
                blVar.f285016b = str;
                C9439b a = C102152ax.this.f284974e.mo70883a();
                bkVar.copyOnWrite();
                C102168bl blVar2 = (C102168bl) bkVar.instance;
                blVar2.f285017c = a.f32835aq;
                blVar2.f285015a |= 2;
                if (C102152ax.this.f284974e.mo70891j()) {
                    C92371d dVar = C102152ax.this.f284976g.f283245b;
                    C58833ax k = dVar.f257558c.mo56113h() ? C58833ax.m90834k(((C92391o) dVar.f257558c.mo56107c()).f257645c) : C58836b.f156633a;
                    if (k.mo56113h()) {
                        String str2 = (String) k.mo56107c();
                        bkVar.copyOnWrite();
                        C102168bl blVar3 = (C102168bl) bkVar.instance;
                        str2.getClass();
                        blVar3.f285015a |= 4;
                        blVar3.f285018d = str2;
                    }
                }
                if (C102152ax.this.f284976g.f283244a.f284137d.get()) {
                    C58833ax c = C102152ax.this.f284978i.mo92324c();
                    if (c.mo56113h()) {
                        String str3 = (String) c.mo56107c();
                        bkVar.copyOnWrite();
                        C102168bl blVar4 = (C102168bl) bkVar.instance;
                        str3.getClass();
                        blVar4.f285015a |= 8;
                        blVar4.f285019e = str3;
                    }
                }
                C102166bj bjVar = new C102166bj();
                Bundle bundle = new Bundle();
                bundle.putByteArray("vaa_consent_fragment_args", ((C102168bl) bkVar.build()).toByteArray());
                bjVar.setArguments(bundle);
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo511h(R.id.vaa_consent_fragment, bjVar, "VaaConsentFragment", 1);
                aVar.mo509f();
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C102152ax(C102150av avVar, C74555u uVar, C46801dp dpVar, C46723bg bgVar, C46128f fVar, C101497ae aeVar, C101495ac acVar, String str) {
        this.f284971b = avVar;
        this.f284974e = uVar;
        this.f284972c = dpVar;
        this.f284973d = bgVar;
        this.f284975f = fVar;
        this.f284976g = aeVar;
        this.f284978i = acVar;
        this.f284977h = str;
    }

    /* renamed from: a */
    public final Fragment mo92914a() {
        return this.f284971b.getChildFragmentManager().f634a.mo670b(R.id.vaa_consent_fragment);
    }
}
