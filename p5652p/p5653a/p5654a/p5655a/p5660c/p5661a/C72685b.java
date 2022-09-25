package p5652p.p5653a.p5654a.p5655a.p5660c.p5661a;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
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
import p211b.p212a.p215c.C4652a;
import p211b.p212a.p215c.C4653b;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;

/* renamed from: p.a.a.a.c.a.b */
/* compiled from: PG */
public class C72685b extends C20061bs {

    /* renamed from: a */
    private C4653b f193286a;

    /* renamed from: b */
    private CheckBox f193287b;

    public C72685b(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        CheckBox checkBox = new CheckBox(context);
        this.f193287b = checkBox;
        linearLayout.addView(checkBox);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4653b.f14588i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4653b bVar = (C4653b) obj;
        this.f193286a = bVar;
        C4665l lVar = bVar.f14591b;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        mo25249w(C19752a.m37610c(lVar));
        this.f193287b.setText(this.f193286a.f14593d);
        CheckBox checkBox = this.f193287b;
        C4659f fVar = this.f193286a.f14594e;
        if (fVar == null) {
            fVar = C4659f.f14603e;
        }
        checkBox.setTextColor(C58053a.m88812a(fVar));
        float f = this.f193286a.f14595f;
        if (f > 0.0f) {
            this.f193287b.setTextSize(f);
        }
        this.f193287b.setChecked(this.f193286a.f14592c);
        this.f193287b.setClickable(true);
        this.f193287b.setEnabled(true ^ this.f193286a.f14596g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56425d dVar = this.f57588z;
        C4652a aVar = (C4652a) this.f193286a.toBuilder();
        boolean isChecked = this.f193287b.isChecked();
        aVar.copyOnWrite();
        C4653b bVar = (C4653b) aVar.instance;
        bVar.f14590a |= 2;
        bVar.f14592c = isChecked;
        this.f193286a = (C4653b) aVar.build();
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C4653b.f14588i, this.f193286a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        this.f193287b.setOnCheckedChangeListener(new C72684a(this));
    }
}
