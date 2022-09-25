package com.google.android.libraries.componentview.components.p1682a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19760e;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19761f;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19762g;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19765j;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20573b;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.componentview.components.a.q */
/* compiled from: PG */
public class C19831q extends C20061bs {

    /* renamed from: A */
    private LinearLayout f55420A;

    /* renamed from: B */
    private ImageButton f55421B;

    /* renamed from: C */
    private ImageButton f55422C;

    /* renamed from: D */
    private ImageButton f55423D;

    /* renamed from: E */
    private ImageButton f55424E;

    /* renamed from: F */
    private ImageButton f55425F;

    /* renamed from: G */
    private TextView f55426G;

    /* renamed from: H */
    private TextView f55427H;

    /* renamed from: I */
    private TextView f55428I;

    /* renamed from: J */
    private ImageView f55429J;

    /* renamed from: K */
    private ImageView f55430K;

    /* renamed from: a */
    public String f55431a = "Loading...";

    /* renamed from: b */
    public final C20573b f55432b;

    /* renamed from: c */
    public final C20601ca f55433c;

    /* renamed from: d */
    public C19765j f55434d;

    /* renamed from: e */
    public boolean f55435e;

    /* renamed from: f */
    public boolean f55436f;

    /* renamed from: g */
    public int f55437g;

    /* renamed from: h */
    public int f55438h;

    /* renamed from: i */
    protected final SettableFuture f55439i = new SettableFuture();

    /* renamed from: j */
    public SeekBar f55440j;

    /* renamed from: k */
    public TextView f55441k;

    /* renamed from: l */
    public int f55442l = 1;

    /* renamed from: m */
    public C19830p f55443m;

    /* renamed from: u */
    private String f55444u = "Sorry, unable to play audio.";

    /* renamed from: v */
    private final C20610cj f55445v;

    /* renamed from: w */
    private final C20540i f55446w;

    /* renamed from: x */
    private final Executor f55447x;

    public C19831q(Context context, C56425d dVar, C20601ca caVar, C20566at atVar, C20573b bVar, C20601ca caVar2, C20610cj cjVar, C20540i iVar, Executor executor) {
        super(context, dVar, caVar);
        this.f55432b = bVar;
        this.f55433c = caVar2;
        this.f55445v = cjVar;
        this.f55446w = iVar;
        this.f55447x = executor;
    }

    /* renamed from: m */
    static final String m37688m(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % 60;
        if (hours > 0) {
            return String.format("%d:%02d:%02d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)});
        }
        return String.format("%02d:%02d", new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)});
    }

    /* renamed from: n */
    private final C60870cx m37689n(ImageView imageView, String str) {
        if (C20482m.m38447o(str)) {
            imageView.setVisibility(8);
            return C60856cj.m92900i(new C19744c());
        }
        imageView.setVisibility(0);
        C20540i iVar = this.f55446w;
        str.getClass();
        return iVar.mo25455c(str, imageView, false, false);
    }

    /* renamed from: o */
    private final void m37690o() {
        int i = this.f55437g;
        boolean z = false;
        this.f55422C.setEnabled(i > 0);
        float f = 1.0f;
        this.f55422C.animate().alpha(i > 0 ? 1.0f : 0.26f);
        int i2 = this.f55437g + 1;
        int size = this.f55434d.f55208b.size();
        this.f55421B.setEnabled(i2 < size);
        this.f55421B.animate().alpha(i2 < size ? 1.0f : 0.26f);
        int i3 = this.f55442l;
        if (i3 != 4) {
            z = true;
        }
        this.f55423D.setEnabled(z);
        ViewPropertyAnimator animate = this.f55423D.animate();
        if (i3 == 4) {
            f = 0.26f;
        }
        animate.alpha(f);
        ImageButton imageButton = this.f55423D;
        int i4 = this.f55442l;
        int i5 = R.drawable.quantum_ic_play_arrow_grey600_36;
        if (!(i4 == 1 || i4 == 4)) {
            i5 = R.drawable.quantum_ic_pause_grey600_36;
        }
        imageButton.setImageResource(i5);
        mo25139j();
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f55439i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.audio_player, (ViewGroup) null);
        this.f55420A = linearLayout;
        this.f55421B = (ImageButton) linearLayout.findViewById(R.id.media_next);
        this.f55422C = (ImageButton) this.f55420A.findViewById(R.id.media_prev);
        this.f55424E = (ImageButton) this.f55420A.findViewById(R.id.media_rewind);
        this.f55425F = (ImageButton) this.f55420A.findViewById(R.id.media_seek_forward);
        this.f55423D = (ImageButton) this.f55420A.findViewById(R.id.media_change_state);
        this.f55440j = (SeekBar) this.f55420A.findViewById(R.id.media_seek_bar);
        this.f55441k = (TextView) this.f55420A.findViewById(R.id.song_progress);
        this.f55426G = (TextView) this.f55420A.findViewById(R.id.song_duration);
        this.f55427H = (TextView) this.f55420A.findViewById(R.id.audio_title);
        this.f55428I = (TextView) this.f55420A.findViewById(R.id.audio_description);
        this.f55429J = (ImageView) this.f55420A.findViewById(R.id.audio_icon);
        this.f55430K = (ImageView) this.f55420A.findViewById(R.id.audio_large_image);
        this.f55440j.setPadding(0, 0, 0, 0);
        this.f55440j.setOnTouchListener(new C19822h());
        this.f55441k.setText(m37688m(0));
        return this.f55420A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19765j.f55205m);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19765j jVar = (C19765j) obj;
        this.f55434d = jVar;
        this.f55437g = jVar.f55209c;
        this.f55436f = jVar.f55212f;
        boolean z = jVar.f55211e;
        this.f55435e = z;
        this.f55438h = jVar.f55210d;
        this.f55443m = new C19830p(this);
        int i = jVar.f55207a;
        if ((i & 64) != 0) {
            this.f55431a = jVar.f55214h;
        }
        if ((i & 128) != 0) {
            this.f55444u = jVar.f55215i;
        }
        if (z) {
            this.f55432b.mo25507m(jVar, this.f55443m);
        }
        if (this.f55434d.f55208b.size() > 1) {
            this.f55421B.setVisibility(0);
            this.f55421B.setOnClickListener(new C19823i(this, this.f55433c));
            this.f55422C.setVisibility(0);
            this.f55422C.setOnClickListener(new C19824j(this, this.f55433c));
        } else {
            this.f55424E.setVisibility(0);
            this.f55424E.setOnClickListener(new C19825k(this, this.f55433c));
            this.f55425F.setVisibility(0);
            this.f55425F.setOnClickListener(new C19826l(this, this.f55433c));
        }
        this.f55423D.setOnClickListener(new C19827m(this, this.f55433c));
        mo25138i();
        m37690o();
    }

    /* renamed from: i */
    public final void mo25138i() {
        C19761f fVar = (C19761f) this.f55434d.f55208b.get(this.f55437g);
        int i = 8;
        this.f55427H.setVisibility((fVar.f55196a & 2) == 0 ? 8 : 0);
        this.f55427H.setText(fVar.f55198c);
        TextView textView = this.f55428I;
        if ((fVar.f55196a & 4) != 0) {
            i = 0;
        }
        textView.setVisibility(i);
        this.f55428I.setText(fVar.f55199d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m37689n(this.f55429J, fVar.f55200e));
        arrayList.add(m37689n(this.f55430K, fVar.f55201f));
        C20482m.m38442j(arrayList, this.f55447x, this.f55439i);
    }

    /* renamed from: j */
    public final void mo25139j() {
        int i;
        C19761f fVar = (C19761f) this.f55434d.f55208b.get(this.f55437g);
        if (!this.f55435e || this.f55432b.mo25498b() <= 0) {
            i = fVar.f55202g;
        } else {
            i = this.f55432b.mo25498b();
        }
        int i2 = this.f55442l;
        if (i2 == 4) {
            this.f55441k.setText(this.f55444u);
        } else if (i2 == 3) {
            this.f55441k.postDelayed(new C19828n(this, this.f55433c, C19742a.ON_DRAW_EXCEPTION), 500);
        } else if (i != 0) {
            this.f55440j.setMax(i);
            this.f55426G.setText(m37688m((long) i));
            this.f55440j.setProgress(this.f55438h);
            this.f55441k.setText(m37688m((long) this.f55438h));
            if (((C19761f) this.f55434d.f55208b.get(this.f55437g)).f55202g == 0) {
                C19762g gVar = (C19762g) this.f55434d.toBuilder();
                int i3 = this.f55437g;
                C19760e eVar = (C19760e) fVar.toBuilder();
                eVar.copyOnWrite();
                C19761f fVar2 = (C19761f) eVar.instance;
                fVar2.f55196a |= 32;
                fVar2.f55202g = i;
                gVar.copyOnWrite();
                C19765j jVar = (C19765j) gVar.instance;
                C19761f fVar3 = (C19761f) eVar.build();
                fVar3.getClass();
                C62971cq cqVar = jVar.f55208b;
                if (!cqVar.mo58948c()) {
                    jVar.f55208b = C62942bv.mutableCopy(cqVar);
                }
                jVar.f55208b.set(i3, fVar3);
                this.f55434d = (C19765j) gVar.build();
            }
        } else {
            this.f55441k.setText(m37688m((long) this.f55438h));
        }
    }

    /* renamed from: k */
    public final void mo25140k() {
        C19762g gVar = (C19762g) this.f55434d.toBuilder();
        int i = this.f55437g;
        gVar.copyOnWrite();
        C19765j jVar = (C19765j) gVar.instance;
        jVar.f55207a |= 1;
        jVar.f55209c = i;
        int i2 = this.f55438h;
        gVar.copyOnWrite();
        C19765j jVar2 = (C19765j) gVar.instance;
        jVar2.f55207a |= 2;
        jVar2.f55210d = i2;
        this.f55434d = (C19765j) gVar.build();
        m37690o();
        String c = mo25097c();
        if (c != null) {
            this.f55445v.mo25491a("CardStateChanged", C58495hd.m89900n("CardId", c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C19762g gVar = (C19762g) this.f55434d.toBuilder();
        int i = this.f55437g;
        gVar.copyOnWrite();
        C19765j jVar = (C19765j) gVar.instance;
        jVar.f55207a |= 1;
        jVar.f55209c = i;
        boolean z = this.f55435e;
        gVar.copyOnWrite();
        C19765j jVar2 = (C19765j) gVar.instance;
        jVar2.f55207a |= 4;
        jVar2.f55211e = z;
        boolean z2 = this.f55436f;
        gVar.copyOnWrite();
        C19765j jVar3 = (C19765j) gVar.instance;
        jVar3.f55207a |= 8;
        jVar3.f55212f = z2;
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19765j.f55205m, (C19765j) gVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: l */
    public final void mo25141l() {
        boolean z = false;
        if (this.f55442l != 4 && this.f55435e && this.f55432b.mo25506l()) {
            z = true;
        }
        this.f55425F.setEnabled(z);
        ViewPropertyAnimator animate = this.f55425F.animate();
        float f = true != z ? 0.26f : 1.0f;
        animate.alpha(f);
        this.f55424E.setEnabled(z);
        this.f55424E.animate().alpha(f);
    }
}
