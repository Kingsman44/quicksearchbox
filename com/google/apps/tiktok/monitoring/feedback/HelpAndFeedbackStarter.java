package com.google.apps.tiktok.monitoring.feedback;

import android.app.Activity;
import android.content.Intent;
import android.os.BadParcelableException;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public final class HelpAndFeedbackStarter {

    /* renamed from: a */
    public static final C59071e f123236a = C59071e.m91332i("com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter");

    /* renamed from: b */
    public final Activity f123237b;

    /* renamed from: c */
    public final C46439e f123238c;

    /* renamed from: d */
    public final C69464a f123239d;

    /* renamed from: e */
    public final C46440f f123240e = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) HelpAndFeedbackStarter.f123236a.mo56225c()).mo56382g(th)).mo56372aa(54744)).mo56386p("Unable to start HelpAndFeedback");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            mo51299d((Intent) obj2);
        }

        /* renamed from: d */
        public final void mo51299d(Intent intent) {
            try {
                ((C47489z) HelpAndFeedbackStarter.this.f123239d.mo17428b()).mo51339b(HelpAndFeedbackStarter.this.f123237b, intent);
            } catch (BadParcelableException e) {
                ((C59052c) ((C59052c) ((C59052c) HelpAndFeedbackStarter.f123236a.mo56225c()).mo56382g(e)).mo56372aa(54745)).mo56386p("Unable to start HelpAndFeedback");
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: f */
    private final C58833ax f123241f;

    /* renamed from: g */
    private final C2376g f123242g;

    public HelpAndFeedbackStarter(Activity activity, Fragment fragment, C46439e eVar, C58833ax axVar, C69464a aVar) {
        C474601 r0 = new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                HelpAndFeedbackStarter helpAndFeedbackStarter = HelpAndFeedbackStarter.this;
                helpAndFeedbackStarter.f123238c.mo50429i(helpAndFeedbackStarter.f123240e);
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
        this.f123242g = r0;
        this.f123237b = activity;
        this.f123238c = eVar;
        if (!axVar.mo56113h() || ((AccountId) axVar.mo56107c()).mo50068a() != -1) {
            this.f123241f = axVar;
        } else {
            this.f123241f = C58836b.f156633a;
        }
        this.f123239d = aVar;
        C58838bb.m90883r(fragment.getLifecycle().mo5789a() == C2383n.INITIALIZED);
        fragment.getLifecycle().mo5790b(r0);
    }

    /* renamed from: a */
    public final void mo51298a(C47488y yVar, C47475l lVar) {
        C60870cx a = ((C47489z) this.f123239d.mo17428b()).mo51338a(this.f123241f, yVar, lVar, this.f123237b);
        C46439e eVar = this.f123238c;
        C46438d dVar = new C46438d(a);
        eVar.mo50428h(dVar.f121541a, (Object) null, this.f123240e);
    }
}
