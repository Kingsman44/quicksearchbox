package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.ag.s;
import com.google.android.apps.gsa.nga.engine.ap.i;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74831y;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75119bv;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80390c;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.h */
/* compiled from: PG */
public final class C78069h {

    /* renamed from: a */
    public static final C59071e f215038a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.answer.h");

    /* renamed from: b */
    public final C60950i f215039b;

    /* renamed from: c */
    public final C81449a f215040c;

    /* renamed from: d */
    public boolean f215041d = false;

    /* renamed from: e */
    public Instant f215042e = Instant.EPOCH;

    /* renamed from: f */
    public C80390c f215043f = null;

    /* renamed from: g */
    public final C75119bv f215044g;

    /* renamed from: h */
    private final C78037aj f215045h;

    /* renamed from: i */
    private final Context f215046i;

    /* renamed from: j */
    private final C78078q f215047j;

    /* renamed from: k */
    private final C22871g f215048k;

    /* renamed from: l */
    private final i f215049l;

    /* renamed from: m */
    private final af f215050m;

    /* renamed from: n */
    private C60870cx f215051n;

    /* renamed from: o */
    private final C78076o f215052o;

    /* renamed from: p */
    private Duration f215053p = null;

    /* renamed from: q */
    private ConfirmCancelCountDownLayout f215054q = null;

    /* renamed from: r */
    private final C78072k f215055r;

    public C78069h(Context context, C75119bv bvVar, C78037aj ajVar, C78076o oVar, C60950i iVar, i iVar2, C78078q qVar, C22871g gVar, C78075n nVar, af afVar, C81449a aVar) {
        C78068g gVar2 = new C78068g(this);
        this.f215055r = gVar2;
        this.f215045h = ajVar;
        this.f215044g = bvVar;
        this.f215046i = context;
        this.f215052o = oVar;
        this.f215039b = iVar;
        this.f215049l = iVar2;
        this.f215047j = qVar;
        this.f215048k = gVar;
        this.f215050m = afVar;
        this.f215040c = aVar;
        nVar.f215059a.add(gVar2);
    }

    /* renamed from: a */
    public final void mo73049a() {
        ConfirmCancelCountDownLayout confirmCancelCountDownLayout = this.f215054q;
        if (confirmCancelCountDownLayout != null) {
            confirmCancelCountDownLayout.mo72980c();
            confirmCancelCountDownLayout.mo72979b();
        }
    }

    /* renamed from: b */
    public final void mo73050b() {
        ConfirmCancelCountDownLayout confirmCancelCountDownLayout = this.f215054q;
        if (confirmCancelCountDownLayout != null) {
            confirmCancelCountDownLayout.mo72980c();
            synchronized (confirmCancelCountDownLayout.f214911b) {
                Runnable runnable = confirmCancelCountDownLayout.f214914e;
                if (runnable != null) {
                    runnable.run();
                    confirmCancelCountDownLayout.f214914e = null;
                }
                confirmCancelCountDownLayout.f214913d = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo73051c() {
        C78078q qVar = this.f215047j;
        qVar.f215063a.mo28212l("[NGA] finishAnswerUi", new C78077p(qVar));
        this.f215054q = null;
        this.f215043f = null;
        C78037aj ajVar = this.f215045h;
        ajVar.f214955c = Optional.empty();
        ajVar.mo73004a();
    }

    /* renamed from: d */
    public final synchronized void mo73052d() {
        C60870cx cxVar = this.f215051n;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f215051n = null;
        }
    }

    /* renamed from: e */
    public final void mo73053e(long j) {
        mo73052d();
        this.f215051n = this.f215048k.mo28208h("[NGA] AnswerUiController.scheduleClearUi", j, new C78067f(this));
    }

    /* renamed from: f */
    public final void mo73054f(C78071j jVar) {
        C58485gu guVar;
        this.f215049l.c(jVar.mo73012e());
        C78037aj ajVar = this.f215045h;
        C78040am amVar = new C78040am();
        amVar.mo72991a(true);
        amVar.mo72992b(false);
        amVar.mo72994d(C58485gu.m89845m());
        amVar.mo72993c(false);
        Optional ofNullable = Optional.ofNullable(jVar.mo73011c());
        if (ofNullable != null) {
            amVar.f214974b = ofNullable;
            Optional ofNullable2 = Optional.ofNullable(jVar.mo73010b());
            if (ofNullable2 != null) {
                amVar.f214975c = ofNullable2;
                Optional ofNullable3 = Optional.ofNullable(jVar.mo73016h());
                if (ofNullable3 != null) {
                    amVar.f214976d = ofNullable3;
                    Optional ofNullable4 = Optional.ofNullable(jVar.mo73015g());
                    if (ofNullable4 != null) {
                        amVar.f214973a = ofNullable4;
                        amVar.mo72993c(jVar.mo73020k());
                        amVar.mo72991a(jVar.mo73019j());
                        amVar.mo72992b(jVar.mo73021l());
                        amVar.mo72994d(jVar.mo73012e());
                        if (amVar.f214982j != 7 || (guVar = amVar.f214977e) == null) {
                            StringBuilder sb = new StringBuilder();
                            if (amVar.f214977e == null) {
                                sb.append(" suggestions");
                            }
                            if ((1 & amVar.f214982j) == 0) {
                                sb.append(" cardHeadingVisible");
                            }
                            if ((amVar.f214982j & 2) == 0) {
                                sb.append(" showKeyboard");
                            }
                            if ((amVar.f214982j & 4) == 0) {
                                sb.append(" safeForLockScreen");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        ajVar.f214955c = Optional.m71637of(new C78041an(amVar.f214973a, amVar.f214974b, amVar.f214975c, amVar.f214976d, guVar, amVar.f214978f, amVar.f214979g, amVar.f214980h, amVar.f214981i));
                        ajVar.mo73004a();
                        Intent addFlags = new Intent(this.f215046i, AnswerUiActivity.class).addFlags(805306368);
                        Uri a = jVar.mo73009a();
                        if (a != null) {
                            addFlags.setDataAndType(a, "image/png");
                        }
                        C80390c cVar = C80390c.UNKNOWN_TYPE;
                        int m = jVar.mo73022m();
                        int i = m - 1;
                        if (m != 0) {
                            if (i == 0) {
                                addFlags.putExtra("utterance_id", BuildConfig.FLAVOR);
                                this.f215040c.mo74742c(addFlags);
                            } else if (i == 1) {
                                this.f215040c.mo74741b(addFlags);
                            } else if (i == 2) {
                                addFlags.putExtra("utterance_id", BuildConfig.FLAVOR);
                                this.f215040c.mo74743d(addFlags);
                            }
                            Duration f = jVar.mo73014f();
                            this.f215053p = f;
                            if (f == null) {
                                mo73052d();
                            } else if (!this.f215041d) {
                                mo73053e(f.toMillis());
                                this.f215041d = true;
                            }
                            if (this.f215053p != null) {
                                this.f215042e = this.f215039b.mo57444a().plus(this.f215053p);
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    throw new NullPointerException("Null cardHeading");
                }
                throw new NullPointerException("Null onActivityFinish");
            }
            throw new NullPointerException("Null contentFragment");
        }
        throw new NullPointerException("Null contentView");
    }

    /* renamed from: g */
    public final void mo73055g(C78043ap apVar) {
        Optional optional;
        long j;
        Object obj;
        C78043ap apVar2 = apVar;
        C80390c cVar = C80390c.UNKNOWN_TYPE;
        C78042ao aoVar = (C78042ao) apVar2;
        C80390c a = C80390c.m128124a(aoVar.f214992a.f220637a);
        if (a == null) {
            a = C80390c.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                MessageLayout b = this.f215052o.mo73059b();
                b.mo72985c().setText(aoVar.f214992a.f220642f);
                b.mo72984b().setText(aoVar.f214992a.f220641e);
                af afVar = this.f215050m;
                C74831y yVar = (C74831y) ((C58495hd) afVar.j(new s(afVar), C58729pv.f156485a)).get(aoVar.f214992a.f220639c);
                if (yVar == null) {
                    optional = Optional.empty();
                } else {
                    optional = Optional.ofNullable((Drawable) yVar.mo71224c().get());
                }
                if (optional.isPresent()) {
                    b.mo72983a().setVisibility(0);
                    b.mo72983a().setImageDrawable((Drawable) optional.get());
                } else {
                    b.mo72983a().setVisibility(8);
                }
                ConfirmCancelCountDownLayout a2 = this.f215052o.mo73058a();
                this.f215054q = a2;
                C80390c a3 = C80390c.m128124a(aoVar.f214992a.f220637a);
                if (a3 == null) {
                    a3 = C80390c.UNRECOGNIZED;
                }
                this.f215043f = a3;
                b.setOnClickListener(new C78054b(a2));
                b.setOnTouchListener(new C78064c(a2));
                C78070i d = C78071j.m125368d();
                C78038ak akVar = (C78038ak) d;
                akVar.f214956a = a2;
                akVar.f214959d = aoVar.f214992a.f220638b;
                mo73054f(d.mo73005a());
                C78065d dVar = new C78065d(this, apVar2);
                C78066e eVar = new C78066e(this, apVar2);
                Duration ofMillis = Duration.ofMillis(aoVar.f214992a.f220643g);
                if (ofMillis == null) {
                    j = 4500;
                } else {
                    j = ofMillis.toMillis();
                }
                long j2 = j;
                FrameLayout frameLayout = (FrameLayout) a2.findViewById(R.id.confirm_cancel_content);
                frameLayout.removeAllViews();
                frameLayout.addView(b);
                a2.mo72980c();
                a2.mo72979b();
                ProgressBar progressBar = (ProgressBar) a2.findViewById(R.id.confirm_progress_circle);
                View findViewById = a2.findViewById(R.id.confirm_btn);
                View findViewById2 = a2.findViewById(R.id.cancel_btn);
                synchronized (a2.f214911b) {
                    a2.f214913d = eVar;
                    a2.f214914e = dVar;
                }
                Object obj2 = a2.f214910a;
                synchronized (obj2) {
                    try {
                        C78046as asVar = r5;
                        obj = obj2;
                        try {
                            C78046as asVar2 = new C78046as(a2, j2, j2 / 100, j2, progressBar, dVar);
                            a2.f214912c = asVar;
                            findViewById.setOnClickListener(new C78044aq(a2, dVar));
                            findViewById2.setOnClickListener(new C78045ar(a2));
                            if (aoVar.f214992a.f220640d) {
                                synchronized (a2.f214910a) {
                                    CountDownTimer countDownTimer = a2.f214912c;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                }
            } else if (ordinal != 2) {
                return;
            }
        }
        C59052c cVar2 = (C59052c) ((C59052c) f215038a.mo56225c()).mo56372aa(5014);
        C80390c a4 = C80390c.m128124a(aoVar.f214992a.f220637a);
        if (a4 == null) {
            a4 = C80390c.UNRECOGNIZED;
        }
        cVar2.mo56389s("Invalid ConfirmationData.Type: %s", a4.name());
    }

    /* renamed from: h */
    public final boolean mo73056h() {
        return this.f215054q != null;
    }
}
