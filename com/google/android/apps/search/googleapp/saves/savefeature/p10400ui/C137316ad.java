package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.saves.p10388b.C137203aa;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.apps.search.googleapp.saves.savefeature.C137232a;
import com.google.android.apps.search.googleapp.saves.savefeature.C137281b;
import com.google.android.apps.search.googleapp.saves.savefeature.C137283c;
import com.google.android.apps.search.googleapp.saves.savefeature.C137296d;
import com.google.android.apps.search.googleapp.saves.savefeature.C137297e;
import com.google.android.apps.search.googleapp.saves.savefeature.C137298f;
import com.google.android.apps.search.googleapp.saves.savefeature.C137299g;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.C137263e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.C137274p;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137253k;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137254l;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137256n;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137257o;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137258p;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137260r;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c.C137353a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c.C137354b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57563ag;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57565ai;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57567ak;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57576at;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57594bk;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57595bl;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57597bn;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57604bu;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57605bv;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57642de;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57662w;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.ad */
/* compiled from: PG */
public final class C137316ad {

    /* renamed from: a */
    public static final C59071e f373524a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.ui.ad");

    /* renamed from: b */
    public final C137314ab f373525b;

    /* renamed from: c */
    public final C137230y f373526c;

    /* renamed from: d */
    public final C46439e f373527d;

    /* renamed from: e */
    public final C62921ba f373528e;

    /* renamed from: f */
    public final C46401p f373529f;

    /* renamed from: g */
    public final C46401p f373530g;

    /* renamed from: h */
    public final a f373531h;

    /* renamed from: i */
    public final C47770dh f373532i;

    /* renamed from: j */
    public final C28306ab f373533j;

    /* renamed from: k */
    public final C136247a f373534k;

    /* renamed from: l */
    public final C46440f f373535l = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C137316ad.f373524a.mo56226d()).mo56382g(th)).mo56372aa(40960)).mo56386p("Failed to save item.");
            if (!((C137254l) ((ProtoParsers.ParcelableProto) obj).mo58938a(C137254l.f373407g, C137316ad.this.f373528e)).f373414f) {
                C137316ad.this.mo113643d();
                C137316ad.this.mo113649j();
                return;
            }
            C137316ad.this.mo113646g();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            C137256n nVar = (C137256n) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C137256n.f373416c, C137316ad.this.f373528e);
            C137316ad.this.f373530g.mo50381d(C62912at.f169862a, nVar);
            C137316ad adVar = C137316ad.this;
            C137232a aVar = (C137232a) C137281b.f373475c.createBuilder();
            C137283c cVar = (C137283c) C137296d.f373496c.createBuilder();
            C57569am amVar = nVar.f373419b;
            if (amVar == null) {
                amVar = C57569am.f153797f;
            }
            cVar.copyOnWrite();
            amVar.getClass();
            ((C137296d) cVar.instance).f373498a = amVar;
            C57578av avVar = nVar.f373418a;
            if (avVar == null) {
                avVar = C57578av.f153822h;
            }
            C57566aj ajVar = avVar.f153824a;
            if (ajVar == null) {
                ajVar = C57566aj.f153791e;
            }
            cVar.copyOnWrite();
            ajVar.getClass();
            ((C137296d) cVar.instance).f373499b = ajVar;
            C137296d dVar = (C137296d) cVar.build();
            aVar.copyOnWrite();
            C137281b bVar = (C137281b) aVar.instance;
            dVar.getClass();
            bVar.f373478b = dVar;
            bVar.f373477a = 1;
            adVar.mo113648i((C137281b) aVar.build());
            if (!((C137254l) parcelableProto.mo58938a(C137254l.f373407g, C137316ad.this.f373528e)).f373414f) {
                C137316ad adVar2 = C137316ad.this;
                C57578av avVar2 = nVar.f373418a;
                if (avVar2 == null) {
                    avVar2 = C57578av.f153822h;
                }
                if (adVar2.mo113641b() == null) {
                    adVar2.mo113642c();
                }
                C137343b b = adVar2.mo113641b();
                if (b != null) {
                    C137357f a = b.mo17754z();
                    View view = a.f373627b.getView();
                    view.getClass();
                    ((TextView) view.findViewById(R.id.googleapp_save_message)).setText(a.f373626a.getResources().getText(R.string.save_feature_saved_to_prefix));
                    View view2 = a.f373627b.getView();
                    view2.getClass();
                    TextView textView = (TextView) view2.findViewById(R.id.googleapp_selected_list_text);
                    textView.setText(avVar2.f153828e);
                    textView.setOnClickListener(new C47591co(a.f373628c, "ListName onClick", new C137352c(a, textView, avVar2)));
                    textView.setVisibility(0);
                    View view3 = a.f373627b.getView();
                    view3.getClass();
                    ((TextView) view3.findViewById(R.id.googleapp_change_list_text)).setVisibility(0);
                    return;
                }
                return;
            }
            C137316ad.this.mo113646g();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: m */
    public final C46440f f373536m = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C137316ad.f373524a.mo56226d()).mo56382g(th)).mo56372aa(40961)).mo56386p("Failed to unsave item.");
            if (!((C137258p) ((ProtoParsers.ParcelableProto) obj).mo58938a(C137258p.f373421d, C137316ad.this.f373528e)).f373425c) {
                C137316ad.this.mo113643d();
                C137316ad.this.mo113649j();
                return;
            }
            C137316ad.this.mo113646g();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            C137316ad adVar = C137316ad.this;
            C137232a aVar = (C137232a) C137281b.f373475c.createBuilder();
            C137297e eVar = (C137297e) C137298f.f373501b.createBuilder();
            C57569am amVar = ((C137260r) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C137260r.f373427b, C137316ad.this.f373528e)).f373429a;
            if (amVar == null) {
                amVar = C57569am.f153797f;
            }
            eVar.copyOnWrite();
            amVar.getClass();
            ((C137298f) eVar.instance).f373503a = amVar;
            C137298f fVar = (C137298f) eVar.build();
            aVar.copyOnWrite();
            C137281b bVar = (C137281b) aVar.instance;
            fVar.getClass();
            bVar.f373478b = fVar;
            bVar.f373477a = 2;
            adVar.mo113648i((C137281b) aVar.build());
            if (!((C137258p) parcelableProto.mo58938a(C137258p.f373421d, C137316ad.this.f373528e)).f373425c) {
                C137316ad.this.mo113650k(R.string.save_feature_unsave_confirmation, 39254);
            } else {
                C137316ad.this.mo113646g();
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: n */
    public final C46440f f373537n = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C137316ad.f373524a.mo56226d()).mo56382g(th)).mo56372aa(40962)).mo56386p("Failed to query Saved Pages Cache.");
            C137316ad.this.mo113649j();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            C57643df dfVar;
            Void voidR = (Void) obj;
            C137203aa aaVar = (C137203aa) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C137203aa.f373317c, C137316ad.this.f373528e);
            if (aaVar.f373319a) {
                C46401p pVar = C137316ad.this.f373529f;
                C62912at atVar = C62912at.f169862a;
                C137300h a = C137316ad.this.mo113640a();
                String str = aaVar.f373320b;
                C57569am amVar = a.f373509c;
                if (amVar == null) {
                    amVar = C57569am.f153797f;
                }
                if (amVar.f153799a == 9) {
                    dfVar = (C57643df) amVar.f153800b;
                } else {
                    dfVar = C57643df.f153945e;
                }
                C57663x xVar = amVar.f153801c;
                if (xVar == null) {
                    xVar = C57663x.f153984d;
                }
                C137299g gVar = (C137299g) a.toBuilder();
                C57567ak akVar = (C57567ak) amVar.toBuilder();
                C57642de deVar = (C57642de) dfVar.toBuilder();
                deVar.copyOnWrite();
                str.getClass();
                ((C57643df) deVar.instance).f153947a = str;
                C57643df dfVar2 = (C57643df) deVar.build();
                akVar.copyOnWrite();
                C57569am amVar2 = (C57569am) akVar.instance;
                dfVar2.getClass();
                amVar2.f153800b = dfVar2;
                amVar2.f153799a = 9;
                C57662w wVar = (C57662w) xVar.toBuilder();
                wVar.copyOnWrite();
                C57663x xVar2 = (C57663x) wVar.instance;
                str.getClass();
                xVar2.f153986a = 4;
                xVar2.f153987b = str;
                C57663x xVar3 = (C57663x) wVar.build();
                akVar.copyOnWrite();
                xVar3.getClass();
                ((C57569am) akVar.instance).f153801c = xVar3;
                C57569am amVar3 = (C57569am) akVar.build();
                gVar.copyOnWrite();
                amVar3.getClass();
                ((C137300h) gVar.instance).f373509c = amVar3;
                pVar.mo50381d(atVar, (C137300h) gVar.build());
            }
            C137316ad.this.mo113651l(!aaVar.f373319a);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: o */
    private final AccountId f373538o;

    /* renamed from: p */
    private final C137274p f373539p;

    public C137316ad(AccountId accountId, C137314ab abVar, C137274p pVar, C137230y yVar, InstanceStateStoreFactory instanceStateStoreFactory, InstanceStateStoreFactory instanceStateStoreFactory2, C46439e eVar, C62921ba baVar, a aVar, C47770dh dhVar, C28306ab abVar2, IncognitoLifecycleObserver incognitoLifecycleObserver, C136247a aVar2) {
        this.f373538o = accountId;
        this.f373525b = abVar;
        this.f373539p = pVar;
        this.f373526c = yVar;
        this.f373529f = instanceStateStoreFactory.mo50325a("save_args", C137300h.f373505h);
        this.f373530g = instanceStateStoreFactory2.mo50325a("previous_save_response", C137256n.f373416c);
        this.f373527d = eVar;
        this.f373528e = baVar;
        this.f373531h = aVar;
        this.f373532i = dhVar;
        this.f373533j = abVar2;
        this.f373534k = aVar2;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: m */
    private final C137370s m223084m() {
        return (C137370s) this.f373525b.getChildFragmentManager().f634a.mo671c("saveListPicker");
    }

    /* renamed from: n */
    private final void m223085n() {
        Window window = this.f373525b.requireActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 2) == 0) {
            window.addFlags(2);
            attributes.dimAmount = 0.6f;
            window.setAttributes(attributes);
            window.setNavigationBarColor(C1878d.m5128a(this.f373525b.requireContext(), R.color.agsa_color_surface));
        }
    }

    /* renamed from: a */
    public final C137300h mo113640a() {
        C46370ah a = this.f373529f.mo50378a(C62912at.f169862a);
        return a != null ? (C137300h) a.f121384a : C137300h.f373505h;
    }

    /* renamed from: b */
    public final C137343b mo113641b() {
        return (C137343b) this.f373525b.getChildFragmentManager().f634a.mo671c("saveConfirmationTray");
    }

    /* renamed from: c */
    public final void mo113642c() {
        if (mo113641b() == null) {
            AccountId accountId = this.f373538o;
            C137343b bVar = new C137343b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId);
            C0154a aVar = new C0154a(this.f373525b.getChildFragmentManager());
            aVar.mo691x(R.anim.googleapp_save_feature_slide_in_bottom, R.anim.googleapp_save_feature_slide_out_bottom, R.anim.googleapp_save_feature_slide_in_bottom, R.anim.googleapp_save_feature_slide_out_bottom);
            aVar.mo511h(R.id.googleapp_confirmation_tray_fragment_container, bVar, "saveConfirmationTray", 1);
            aVar.mo509f();
        }
    }

    /* renamed from: d */
    public final void mo113643d() {
        C137343b b = mo113641b();
        if (b != null) {
            C0154a aVar = new C0154a(this.f373525b.getChildFragmentManager());
            aVar.mo691x(R.anim.googleapp_save_feature_slide_in_bottom, R.anim.googleapp_save_feature_slide_out_bottom, R.anim.googleapp_save_feature_slide_in_bottom, R.anim.googleapp_save_feature_slide_out_bottom);
            aVar.mo516m(b);
            aVar.mo509f();
        }
    }

    /* renamed from: e */
    public final void mo113644e(C57665z zVar) {
        if (m223084m() == null) {
            C137353a aVar = (C137353a) C137354b.f373619c.createBuilder();
            aVar.copyOnWrite();
            ((C137354b) aVar.instance).f373621a = zVar.getNumber();
            C57648i iVar = mo113640a().f373512f;
            if (iVar != null) {
                aVar.copyOnWrite();
                ((C137354b) aVar.instance).f373622b = iVar;
            }
            C137370s a = C137370s.m223196a(this.f373538o, (C137354b) aVar.build());
            C0154a aVar2 = new C0154a(this.f373525b.getChildFragmentManager());
            aVar2.mo691x(R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out, R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out);
            aVar2.mo511h(R.id.googleapp_list_picker_fragment_container, a, "saveListPicker", 1);
            aVar2.mo509f();
        }
    }

    /* renamed from: f */
    public final void mo113645f() {
        C137370s m = m223084m();
        if (m != null) {
            C0154a aVar = new C0154a(this.f373525b.getChildFragmentManager());
            aVar.mo691x(R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out, R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out);
            aVar.mo516m(m);
            aVar.mo509f();
        }
    }

    /* renamed from: g */
    public final void mo113646g() {
        C0167am activity = this.f373525b.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: h */
    public final void mo113647h(C137254l lVar) {
        C137254l lVar2;
        if (!lVar.f373414f) {
            if (mo113641b() == null) {
                mo113642c();
            }
            C137343b b = mo113641b();
            if (b != null) {
                C137357f a = b.mo17754z();
                View view = a.f373627b.getView();
                view.getClass();
                ((TextView) view.findViewById(R.id.googleapp_save_message)).setText(a.f373626a.getResources().getText(R.string.save_feature_save_in_progress));
                View view2 = a.f373627b.getView();
                view2.getClass();
                ((TextView) view2.findViewById(R.id.googleapp_selected_list_text)).setVisibility(8);
                View view3 = a.f373627b.getView();
                view3.getClass();
                ((TextView) view3.findViewById(R.id.googleapp_change_list_text)).setVisibility(8);
            }
        }
        C46439e eVar = this.f373527d;
        C137274p pVar = this.f373539p;
        C137300h a2 = mo113640a();
        if (a2.f373512f != null) {
            C137253k kVar = (C137253k) lVar.toBuilder();
            C57648i iVar = a2.f373512f;
            if (iVar == null) {
                iVar = C57648i.f153953c;
            }
            kVar.copyOnWrite();
            iVar.getClass();
            ((C137254l) kVar.instance).f373413e = iVar;
            lVar2 = (C137254l) kVar.build();
        } else {
            lVar2 = lVar;
        }
        C46370ah a3 = this.f373530g.mo50378a(C62912at.f169862a);
        if (a3 != null) {
            C137253k kVar2 = (C137253k) lVar2.toBuilder();
            C137256n nVar = (C137256n) a3.f121384a;
            kVar2.copyOnWrite();
            nVar.getClass();
            ((C137254l) kVar2.instance).f373412d = nVar;
            lVar2 = (C137254l) kVar2.build();
        }
        eVar.mo50445g(C46438d.m82809a(pVar.mo113602a(lVar2)), C46436b.m82808a(lVar), this.f373535l);
    }

    /* renamed from: i */
    public final void mo113648i(C137281b bVar) {
        Intent intent = new Intent();
        ProtoParsers.m95531n(intent, "SAVE_FEATURE_ACTIVITY_RESULT", bVar);
        C0167am activity = this.f373525b.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
    }

    /* renamed from: j */
    public final void mo113649j() {
        mo113650k(R.string.save_feature_save_generic_error, 39253);
    }

    /* renamed from: k */
    public final void mo113650k(int i, int i2) {
        View view = this.f373525b.getView();
        if (view != null) {
            Snackbar p = Snackbar.m79660p(view, i, 4000);
            C28306ab abVar = this.f373533j;
            p.mo48348m(new C137320ae(this, abVar.mo33801b(p.f117089j, abVar.f76990a.mo33805a(C28427h.m53115a(i2)))));
            p.mo48343h();
        }
    }

    /* renamed from: l */
    public final void mo113651l(boolean z) {
        C137258p pVar;
        Optional optional;
        Optional optional2;
        C137300h a = mo113640a();
        if (z) {
            C57578av avVar = a.f373510d;
            if (avVar == null) {
                avVar = C57578av.f153822h;
            }
            if (avVar.f153824a != null) {
                C57578av avVar2 = a.f373510d;
                if (avVar2 == null) {
                    avVar2 = C57578av.f153822h;
                }
                optional = Optional.m71637of(avVar2);
            } else {
                C57665z a2 = C57665z.m88512a(a.f373508b);
                if (a2 == null) {
                    a2 = C57665z.UNRECOGNIZED;
                }
                int number = a2.getNumber();
                if (number == 1) {
                    optional2 = Optional.m71637of(C57563ag.WANT_TO_GO);
                } else if (number == 2 || number == 5) {
                    optional2 = Optional.m71637of(C57563ag.FAVORITES);
                } else {
                    optional2 = Optional.empty();
                }
                if (optional2.isEmpty()) {
                    optional = Optional.empty();
                } else {
                    C57576at atVar = (C57576at) C57578av.f153822h.createBuilder();
                    C57565ai aiVar = (C57565ai) C57566aj.f153791e.createBuilder();
                    aiVar.copyOnWrite();
                    ((C57566aj) aiVar.instance).f153794b = ((C57563ag) optional2.get()).getNumber();
                    aiVar.mo54517b(a2);
                    C57566aj ajVar = (C57566aj) aiVar.build();
                    atVar.copyOnWrite();
                    ajVar.getClass();
                    ((C57578av) atVar.instance).f153824a = ajVar;
                    optional = Optional.m71637of((C57578av) atVar.build());
                }
            }
            if (optional.isPresent()) {
                if (!a.f373513g) {
                    m223085n();
                }
                C137253k kVar = (C137253k) C137254l.f373407g.createBuilder();
                C57569am amVar = a.f373509c;
                if (amVar == null) {
                    amVar = C57569am.f153797f;
                }
                kVar.copyOnWrite();
                amVar.getClass();
                ((C137254l) kVar.instance).f373411c = amVar;
                C57578av avVar3 = (C57578av) optional.get();
                kVar.copyOnWrite();
                C137254l lVar = (C137254l) kVar.instance;
                avVar3.getClass();
                lVar.f373410b = avVar3;
                lVar.f373409a = 5;
                boolean z2 = a.f373513g;
                kVar.copyOnWrite();
                ((C137254l) kVar.instance).f373414f = z2;
                mo113647h((C137254l) kVar.build());
                return;
            }
            m223085n();
            C57665z a3 = C57665z.m88512a(a.f373508b);
            if (a3 == null) {
                a3 = C57665z.UNRECOGNIZED;
            }
            mo113644e(a3);
            return;
        }
        C137257o oVar = (C137257o) C137258p.f373421d.createBuilder();
        C57569am amVar2 = a.f373509c;
        if (amVar2 == null) {
            amVar2 = C57569am.f153797f;
        }
        C57663x xVar = amVar2.f153801c;
        if (xVar == null) {
            xVar = C57663x.f153984d;
        }
        oVar.copyOnWrite();
        xVar.getClass();
        ((C137258p) oVar.instance).f373423a = xVar;
        boolean z3 = a.f373513g;
        oVar.copyOnWrite();
        ((C137258p) oVar.instance).f373425c = z3;
        C137258p pVar2 = (C137258p) oVar.build();
        if (!pVar2.f373425c) {
            mo113643d();
        }
        C46439e eVar = this.f373527d;
        C137274p pVar3 = this.f373539p;
        C137300h a4 = mo113640a();
        if (a4.f373512f != null) {
            C137257o oVar2 = (C137257o) pVar2.toBuilder();
            C57648i iVar = a4.f373512f;
            if (iVar == null) {
                iVar = C57648i.f153953c;
            }
            oVar2.copyOnWrite();
            iVar.getClass();
            ((C137258p) oVar2.instance).f373424b = iVar;
            pVar = (C137258p) oVar2.build();
        } else {
            pVar = pVar2;
        }
        C57594bk bkVar = (C57594bk) C57595bl.f153864e.createBuilder();
        C57648i iVar2 = pVar.f373424b;
        if (iVar2 == null) {
            iVar2 = pVar3.mo113603b();
        }
        C57601br c = C137274p.m223026c(iVar2);
        bkVar.copyOnWrite();
        c.getClass();
        ((C57595bl) bkVar.instance).f153866a = c;
        C57663x xVar2 = pVar.f373423a;
        if (xVar2 == null) {
            xVar2 = C57663x.f153984d;
        }
        bkVar.copyOnWrite();
        xVar2.getClass();
        ((C57595bl) bkVar.instance).f153867b = xVar2;
        bkVar.copyOnWrite();
        ((C57595bl) bkVar.instance).f153868c = true;
        C57595bl blVar = (C57595bl) bkVar.build();
        C57604bu buVar = pVar3.f373452d;
        C70888j jVar = buVar.f189039a;
        C70338di diVar = C57605bv.f153887d;
        if (diVar == null) {
            synchronized (C57605bv.class) {
                diVar = C57605bv.f153887d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.search.platform.save.v2.SaveService", "RemoveItemFromAllLists");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C57595bl.f153864e);
                    d.f187486b = C70850d.m103697c(C57597bn.f153871b);
                    C70338di a5 = d.mo62040a();
                    C57605bv.f153887d = a5;
                    diVar = a5;
                }
            }
        }
        C60870cx a6 = C70876o.m103760a(jVar.mo39510a(diVar, buVar.f189040b), blVar);
        C137263e eVar2 = new C137263e(pVar3, blVar);
        eVar.mo50445g(C46438d.m82809a(C60922j.m93045h(a6, C47810es.m84966f(eVar2), pVar3.f373458j)), C46436b.m82808a(pVar2), this.f373536m);
    }
}
