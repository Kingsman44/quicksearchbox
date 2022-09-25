package p5652p.p5653a.p5654a.p5655a.p5676k.p5677a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.C20081f;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4463ce.p4464a.p4465a.p4466a.p4469b.C58053a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;
import p211b.p212a.p224l.C4682a;
import p211b.p212a.p224l.C4683b;

/* renamed from: p.a.a.a.k.a.c */
/* compiled from: PG */
public class C72732c extends C20061bs {

    /* renamed from: a */
    public int f193390a = -1;

    /* renamed from: b */
    private C4683b f193391b;

    /* renamed from: c */
    private SeekBar f193392c;

    /* renamed from: d */
    private TextView f193393d;

    public C72732c(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        SeekBar seekBar = new SeekBar(context);
        this.f193392c = seekBar;
        linearLayout.addView(seekBar);
        TextView textView = new TextView(context);
        this.f193393d = textView;
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4683b.f14691i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4683b bVar = (C4683b) obj;
        this.f193391b = bVar;
        C4665l lVar = bVar.f14694b;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        mo25249w(C19752a.m37610c(lVar));
        this.f193393d.setText(this.f193391b.f14696d);
        TextView textView = this.f193393d;
        C4659f fVar = this.f193391b.f14697e;
        if (fVar == null) {
            fVar = C4659f.f14603e;
        }
        textView.setTextColor(C58053a.m88812a(fVar));
        float f = this.f193391b.f14698f;
        if (f > 0.0f) {
            this.f193393d.setTextSize(f);
        }
        this.f193392c.setProgress(this.f193391b.f14695c);
        this.f193392c.setEnabled(!this.f193391b.f14699g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56425d dVar = this.f57588z;
        C4682a aVar = (C4682a) this.f193391b.toBuilder();
        int progress = this.f193392c.getProgress();
        aVar.copyOnWrite();
        C4683b bVar = (C4683b) aVar.instance;
        bVar.f14693a |= 2;
        bVar.f14695c = progress;
        this.f193391b = (C4683b) aVar.build();
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C4683b.f14691i, this.f193391b);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        C20081f.m37970b(this.f56306q, "render", this.f193392c, new Object[0]);
        this.f193392c.setOnSeekBarChangeListener(new C72731b(this));
    }
}
