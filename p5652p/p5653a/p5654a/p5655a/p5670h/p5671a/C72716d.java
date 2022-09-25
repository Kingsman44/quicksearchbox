package p5652p.p5653a.p5654a.p5655a.p5670h.p5671a;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import p211b.p212a.p221i.C4676a;
import p211b.p212a.p221i.C4677b;

/* renamed from: p.a.a.a.h.a.d */
/* compiled from: PG */
public class C72716d extends C20061bs {

    /* renamed from: b */
    public static final /* synthetic */ int f193353b = 0;

    /* renamed from: a */
    public int f193354a;

    /* renamed from: c */
    private C4677b f193355c;

    public C72716d(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        RadioGroup radioGroup = new RadioGroup(context);
        radioGroup.setOrientation(1);
        return radioGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4677b.f14666i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f193355c = (C4677b) obj;
        for (int i = 0; i < this.f193355c.f14671d.size(); i++) {
            RadioButton radioButton = new RadioButton(this.f56304o);
            radioButton.setText((String) this.f193355c.f14671d.get(i));
            C4659f fVar = this.f193355c.f14672e;
            if (fVar == null) {
                fVar = C4659f.f14603e;
            }
            radioButton.setTextColor(C58053a.m88812a(fVar));
            float f = this.f193355c.f14673f;
            if (f > 0.0f) {
                radioButton.setTextSize(f);
            }
            radioButton.setEnabled(true ^ this.f193355c.f14674g);
            ((RadioGroup) this.f56305p).addView(radioButton);
        }
        ((RadioGroup) this.f56305p).setOnCheckedChangeListener(C72715c.f193352a);
        if (this.f193355c.f14670c < 0) {
            ((RadioGroup) this.f56305p).clearCheck();
        } else {
            int i2 = 0;
            while (i2 < ((RadioGroup) this.f56305p).getChildCount()) {
                ((RadioButton) ((RadioGroup) this.f56305p).getChildAt(i2)).setChecked(i2 == this.f193355c.f14670c);
                i2++;
            }
        }
        C4665l lVar = this.f193355c.f14669b;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        mo25249w(C19752a.m37610c(lVar));
        this.f193354a = ((RadioGroup) this.f56305p).getCheckedRadioButtonId();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo64524i() {
        int checkedRadioButtonId = ((RadioGroup) this.f56305p).getCheckedRadioButtonId();
        int i = 0;
        for (int i2 = 0; i2 < ((RadioGroup) this.f56305p).getChildCount(); i2++) {
            if (((RadioGroup) this.f56305p).getChildAt(i2) instanceof RadioButton) {
                if (((RadioGroup) this.f56305p).getChildAt(i2).getId() == checkedRadioButtonId) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56425d dVar = this.f57588z;
        C4676a aVar = (C4676a) this.f193355c.toBuilder();
        int i = mo64524i();
        aVar.copyOnWrite();
        C4677b bVar = (C4677b) aVar.instance;
        bVar.f14668a |= 2;
        bVar.f14670c = i;
        this.f193355c = (C4677b) aVar.build();
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C4677b.f14666i, this.f193355c);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        ((RadioGroup) this.f56305p).setOnCheckedChangeListener(new C72714b(this));
    }
}
