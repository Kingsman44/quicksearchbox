package com.google.android.apps.search.googleapp.discover.channels;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1882h;
import com.google.android.apps.search.googleapp.discover.p10166a.p10167a.C133937c;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2201h.C28431d;
import com.google.android.material.chip.Chip;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62931bk;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.al */
/* compiled from: PG */
public final class C134121al {

    /* renamed from: a */
    public static final C59071e f365343a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.channels.al");

    /* renamed from: b */
    public final C53842b f365344b;

    /* renamed from: c */
    public final C46801dp f365345c;

    /* renamed from: d */
    public final C46439e f365346d;

    /* renamed from: e */
    public final C134139ba f365347e;

    /* renamed from: f */
    public final C134116ag f365348f;

    /* renamed from: g */
    public final C47770dh f365349g;

    /* renamed from: h */
    public final C28306ab f365350h;

    /* renamed from: i */
    public final C28431d f365351i;

    /* renamed from: j */
    public final boolean f365352j;

    /* renamed from: k */
    public final C134150bl f365353k;

    /* renamed from: l */
    public final boolean f365354l;

    /* renamed from: m */
    public final C47449e f365355m;

    /* renamed from: n */
    public final boolean f365356n;

    /* renamed from: o */
    public final C134123b f365357o = new C134123b();

    /* renamed from: p */
    public final C134122a f365358p = new C134122a();

    /* renamed from: q */
    public final C133937c f365359q;

    /* renamed from: com.google.android.apps.search.googleapp.discover.channels.al$a */
    /* compiled from: PG */
    final class C134122a implements C46440f {
        public C134122a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C134121al.f365343a.mo56225c()).mo56382g(th)).mo56372aa(40311)).mo56389s("Unable to %s", true != ((Boolean) obj).booleanValue() ? "unfollow" : "follow");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            if (((Boolean) obj).booleanValue()) {
                View view = C134121al.this.f365348f.getView();
                if (view == null) {
                    ((C59052c) ((C59052c) C134121al.f365343a.mo56226d()).mo56372aa(40312)).mo56386p("We can only display Toast when the view exists.");
                    return;
                }
                Snackbar.m79661q((Context) null, view, C134121al.this.f365348f.getContext().getString(R.string.googleapp_discover_channels_follow_channel_snackbar_text, new Object[]{C134121al.this.f365344b.f141318d}), 0).mo48343h();
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.googleapp.discover.channels.al$b */
    /* compiled from: PG */
    final class C134123b implements C46792di {
        public C134123b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C134121al.f365343a.mo56225c()).mo56382g(th)).mo56372aa(40314)).mo56386p("Failed to fetch channel status");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C134154bp bpVar;
            C134144bf bfVar = (C134144bf) obj;
            View view = C134121al.this.f365348f.getView();
            if (view == null) {
                ((C59052c) ((C59052c) C134121al.f365343a.mo56226d()).mo56372aa(40315)).mo56386p("Invalid state as callback subscription guarantees view is populated.");
                return;
            }
            C134121al alVar = C134121al.this;
            boolean z = bfVar.f365423f;
            View view2 = alVar.f365348f.getView();
            if (view2 == null) {
                ((C59052c) ((C59052c) C134121al.f365343a.mo56225c()).mo56372aa(40317)).mo56386p("Attempting to change follow button state when view has been destroyed.");
            } else if (alVar.f365352j) {
                View findViewById = view2.findViewById(R.id.googleapp_discover_channels_follow_section);
                View findViewById2 = view2.findViewById(R.id.googleapp_discover_channels_follow_button);
                View findViewById3 = view2.findViewById(R.id.googleapp_discover_channels_unfollow_button);
                int i = 8;
                if (findViewById.getVisibility() == 8) {
                    findViewById.setVisibility(0);
                    C28306ab abVar = alVar.f365350h;
                    abVar.mo33801b(findViewById2, abVar.f76990a.mo33805a(C28427h.m53115a(125300)));
                    C28306ab abVar2 = alVar.f365350h;
                    abVar2.mo33801b(findViewById3, abVar2.f76990a.mo33805a(C28427h.m53115a(125301)));
                }
                findViewById2.setVisibility(true != z ? 0 : 8);
                if (true == z) {
                    i = 0;
                }
                findViewById3.setVisibility(i);
            }
            C134121al alVar2 = C134121al.this;
            if (alVar2.f365354l) {
                View view3 = alVar2.f365348f.getView();
                if (view3 == null) {
                    ((C59052c) ((C59052c) C134121al.f365343a.mo56226d()).mo56372aa(40313)).mo56386p("We can only display header when the view exists.");
                } else {
                    boolean a = C133933a.m217248a(C134121al.this.f365348f.getContext());
                    if (!a) {
                        bpVar = bfVar.f365425h;
                        if (bpVar == null) {
                            bpVar = C134154bp.f365444e;
                        }
                    } else {
                        bpVar = bfVar.f365426i;
                        if (bpVar == null) {
                            bpVar = C134154bp.f365444e;
                        }
                    }
                    if (!bpVar.equals(C134154bp.f365444e)) {
                        Chip chip = (Chip) view3.findViewById(R.id.googleapp_discover_channels_follow_button);
                        C58070b bVar = bpVar.f365447b;
                        if (bVar == null) {
                            bVar = C58070b.f155212e;
                        }
                        ColorStateList a2 = C134121al.m217583a(bVar);
                        chip.mo47684o(a2);
                        chip.mo47721v(a2);
                        Chip chip2 = (Chip) view3.findViewById(R.id.googleapp_discover_channels_unfollow_button);
                        C58070b bVar2 = bpVar.f365448c;
                        if (bVar2 == null) {
                            bVar2 = C58070b.f155212e;
                        }
                        ColorStateList a3 = C134121al.m217583a(bVar2);
                        chip2.setTextColor(a3);
                        chip2.mo47696s(a3);
                        ColorStateList d = C1882h.m5138d(C134121al.this.f365348f.getContext(), R.color.agsa_color_dark_on_primary);
                        if (d != null) {
                            chip.mo47696s(d);
                            chip.setTextColor(d);
                            if (true != a) {
                                a2 = d;
                            }
                            chip2.mo47721v(a2);
                        }
                        C47449e eVar = C134121al.this.f365355m;
                        C134152bn bnVar = bpVar.f365449d;
                        if (bnVar == null) {
                            bnVar = C134152bn.f365440c;
                        }
                        eVar.mo51286a().mo11873k(bnVar.f365443b).mo12454r((ImageView) view3.findViewById(R.id.googleapp_discover_channels_backdrop));
                    }
                }
            }
            if ((bfVar.f365418a & 256) != 0) {
                C134121al alVar3 = C134121al.this;
                View view4 = alVar3.f365348f.getView();
                if (view4 == null) {
                    ((C59052c) ((C59052c) C134121al.f365343a.mo56225c()).mo56372aa(40316)).mo56386p("Attempting to show visit button when view has been destroyed.");
                } else {
                    TextView textView = (TextView) view4.findViewById(R.id.googleapp_discover_channels_visit_button);
                    textView.setVisibility(0);
                    C134156br brVar = bfVar.f365427j;
                    if (brVar == null) {
                        brVar = C134156br.f365450d;
                    }
                    String str = brVar.f365453b;
                    C134156br brVar2 = bfVar.f365427j;
                    if (brVar2 == null) {
                        brVar2 = C134156br.f365450d;
                    }
                    textView.setText(C58890d.m90989d(brVar2.f365454c));
                    textView.setOnClickListener(new C47591co(alVar3.f365349g, "VisitUrlButtonClicked", new C134119aj(alVar3, str)));
                }
            }
            if ((bfVar.f365418a & 2) != 0) {
                ((TextView) view.findViewById(R.id.googleapp_discover_channels_title)).setText(bfVar.f365420c);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C134121al(C53842b bVar, C46801dp dpVar, C46439e eVar, C134139ba baVar, C134116ag agVar, C47770dh dhVar, C28306ab abVar, C28431d dVar, C133937c cVar, boolean z, boolean z2, boolean z3, C47449e eVar2) {
        this.f365344b = bVar;
        this.f365345c = dpVar;
        this.f365346d = eVar;
        this.f365347e = baVar;
        this.f365348f = agVar;
        this.f365349g = dhVar;
        this.f365350h = abVar;
        this.f365351i = dVar;
        this.f365359q = cVar;
        this.f365352j = z;
        this.f365356n = z2;
        this.f365354l = z3;
        this.f365355m = eVar2;
        C134149bk bkVar = (C134149bk) C134150bl.f365436c.createBuilder();
        String str = bVar.f141317c;
        bkVar.copyOnWrite();
        C134150bl blVar = (C134150bl) bkVar.instance;
        str.getClass();
        blVar.f365438a |= 1;
        blVar.f365439b = str;
        this.f365353k = (C134150bl) bkVar.build();
    }

    /* renamed from: a */
    public static ColorStateList m217583a(C58070b bVar) {
        C62931bk bkVar = bVar.f155217d;
        if (bkVar == null) {
            bkVar = C62931bk.f169955b;
        }
        return ColorStateList.valueOf(Color.argb((int) (bkVar.f169957a * 255.0f), (int) (bVar.f155214a * 255.0f), (int) (bVar.f155215b * 255.0f), (int) (bVar.f155216c * 255.0f)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo111574b(boolean z) {
        C46438d dVar;
        if (z) {
            dVar = C46438d.m82810b(this.f365347e.mo111578b(this.f365353k));
        } else {
            dVar = C46438d.m82810b(this.f365347e.mo111579c(this.f365353k));
        }
        this.f365346d.mo50445g(dVar, new C46436b(Boolean.valueOf(z)), this.f365358p);
    }
}
