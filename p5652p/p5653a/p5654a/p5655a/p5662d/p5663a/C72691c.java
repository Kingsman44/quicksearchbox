package p5652p.p5653a.p5654a.p5655a.p5662d.p5663a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.componentview.components.base.C20061bs;
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
import p211b.p212a.p217e.C4668a;
import p211b.p212a.p217e.C4669b;

/* renamed from: p.a.a.a.d.a.c */
/* compiled from: PG */
public class C72691c extends C20061bs {

    /* renamed from: a */
    public int f193296a;

    /* renamed from: b */
    private C4669b f193297b;

    /* renamed from: c */
    private Spinner f193298c;

    public C72691c(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4669b.f14633i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4669b bVar = (C4669b) obj;
        this.f193297b = bVar;
        C4665l lVar = bVar.f14636b;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        mo25249w(C19752a.m37610c(lVar));
        if (this.f193298c == null) {
            Spinner spinner = new Spinner(this.f56304o);
            this.f193298c = spinner;
            spinner.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            ((LinearLayout) this.f56305p).addView(this.f193298c);
        }
        this.f193298c.setAdapter(new C72689a(this, this.f56304o, this.f193297b.f14637c));
        C4669b bVar2 = this.f193297b;
        int i = bVar2.f14638d;
        this.f193296a = i;
        if (i < 0 || i >= bVar2.f14637c.size()) {
            this.f193296a = 0;
        }
        this.f193298c.setSelection(this.f193296a);
        this.f193298c.setEnabled(!this.f193297b.f14641g);
    }

    /* renamed from: i */
    public final void mo64511i(TextView textView) {
        C4659f fVar = this.f193297b.f14639e;
        if (fVar == null) {
            fVar = C4659f.f14603e;
        }
        textView.setTextColor(C58053a.m88812a(fVar));
        float f = this.f193297b.f14640f;
        if (f > 0.0f) {
            textView.setTextSize(f);
        }
        C4665l lVar = this.f193297b.f14636b;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        if ((lVar.f14621a & 1) != 0) {
            C4665l lVar2 = this.f193297b.f14636b;
            if (lVar2 == null) {
                lVar2 = C4665l.f14619k;
            }
            C4659f fVar2 = lVar2.f14626f;
            if (fVar2 == null) {
                fVar2 = C4659f.f14603e;
            }
            textView.setBackgroundColor(C58053a.m88812a(fVar2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56425d dVar = this.f57588z;
        C4668a aVar = (C4668a) this.f193297b.toBuilder();
        int selectedItemPosition = this.f193298c.getSelectedItemPosition();
        aVar.copyOnWrite();
        C4669b bVar = (C4669b) aVar.instance;
        bVar.f14635a |= 2;
        bVar.f14638d = selectedItemPosition;
        this.f193297b = (C4669b) aVar.build();
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C4669b.f14633i, this.f193297b);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        this.f193298c.setOnItemSelectedListener(new C72690b(this));
    }
}
