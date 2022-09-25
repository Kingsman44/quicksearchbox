package p5652p.p5653a.p5654a.p5655a.p5678l.p5679a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.widget.C0778x;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.material.textfield.TextInputLayout;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4463ce.p4464a.p4465a.p4466a.p4467a.p4468a.C58052b;
import com.google.p4463ce.p4464a.p4465a.p4466a.p4469b.C58053a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4660g;
import p211b.p212a.p216d.C4661h;
import p211b.p212a.p216d.C4664k;
import p211b.p212a.p216d.C4665l;
import p211b.p212a.p225m.C4684a;
import p211b.p212a.p225m.C4685b;

/* renamed from: p.a.a.a.l.a.k */
/* compiled from: PG */
public class C72745k extends C20061bs {

    /* renamed from: c */
    private static final int[] f193408c = new int[0];

    /* renamed from: a */
    public EditText f193409a;

    /* renamed from: b */
    public C58052b f193410b;

    /* renamed from: d */
    private C4685b f193411d;

    public C72745k(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* renamed from: i */
    private static final ColorStateList m107564i(C4659f fVar) {
        return new ColorStateList(new int[][]{f193408c}, new int[]{C58053a.m88812a(fVar)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo25110e(Context context) {
        C72742h hVar = new C72742h(context);
        this.f193409a = hVar;
        hVar.setThreshold(1);
        return new TextInputLayout(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        int i;
        int i2;
        C62940bt r0 = C62942bv.checkIsLite(C4685b.f14701o);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4685b bVar = (C4685b) obj;
        this.f193411d = bVar;
        C4665l lVar = bVar.f14704b;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        C4664k kVar = (C4664k) lVar.toBuilder();
        C4661h hVar = ((C4665l) kVar.instance).f14627g;
        if (hVar == null) {
            hVar = C4661h.f14610f;
        }
        C4660g gVar = (C4660g) hVar.toBuilder();
        C4661h hVar2 = ((C4665l) kVar.instance).f14627g;
        if (hVar2 == null) {
            hVar2 = C4661h.f14610f;
        }
        int i3 = hVar2.f14613b;
        gVar.copyOnWrite();
        C4661h hVar3 = (C4661h) gVar.instance;
        hVar3.f14612a |= 1;
        hVar3.f14613b = i3 + 16;
        kVar.copyOnWrite();
        C4665l lVar2 = (C4665l) kVar.instance;
        C4661h hVar4 = (C4661h) gVar.build();
        hVar4.getClass();
        lVar2.f14627g = hVar4;
        lVar2.f14621a |= 2;
        mo25249w(C19752a.m37610c((C4665l) kVar.build()));
        EditText editText = this.f193409a;
        C4659f fVar = this.f193411d.f14706d;
        if (fVar == null) {
            fVar = C4659f.f14603e;
        }
        editText.setTextColor(C58053a.m88812a(fVar));
        float f = this.f193411d.f14707e;
        if (f > 0.0f) {
            this.f193409a.setTextSize(f);
        }
        this.f193409a.setTypeface(Typeface.create("sans-serif", 0));
        int i4 = this.f193411d.f14708f;
        if (i4 == 0) {
            i4 = Integer.MAX_VALUE;
        }
        if (i4 > 1) {
            this.f193409a.setSingleLine(false);
            this.f193409a.setMaxLines(i4);
            i = 33554432;
            i2 = C89885b.S3REQUEST_BUILD_PINHOLE_PARAMS_FAILED_VALUE;
        } else {
            i = 33554438;
            i2 = 1;
        }
        EditText editText2 = this.f193409a;
        if (true == this.f193411d.f14715m) {
            i2 = 0;
        }
        editText2.setInputType(i2);
        this.f193409a.setImeOptions(i);
        this.f193409a.setShowSoftInputOnFocus(!this.f193411d.f14715m);
        if (this.f193411d.f14715m) {
            this.f193409a.setFocusable(false);
            this.f193409a.setOnClickListener(new C72736b(this));
        } else {
            this.f193409a.setOnFocusChangeListener(new C72737c(this));
        }
        this.f193409a.setOnKeyListener(new C72738d(this));
        this.f193409a.setOnEditorActionListener(new C72739e(this));
        if (!this.f193411d.f14713k) {
            this.f193409a.addTextChangedListener(new C72743i(this));
        }
        TextInputLayout textInputLayout = (TextInputLayout) this.f56305p;
        textInputLayout.addView(this.f193409a);
        textInputLayout.mo48474h(this.f193411d.f14709g);
        textInputLayout.setEnabled(!this.f193411d.f14714l);
        C4659f fVar2 = this.f193411d.f14710h;
        if (fVar2 == null) {
            fVar2 = C4659f.f14603e;
        }
        ColorStateList i5 = m107564i(fVar2);
        textInputLayout.f117320n = i5;
        textInputLayout.f117321o = i5;
        if (textInputLayout.f117309c != null) {
            textInputLayout.mo48494u(false, false);
        }
        C4685b bVar2 = this.f193411d;
        if ((bVar2.f14703a & 2) != 0 && !bVar2.f14705c.contentEquals(this.f193409a.getText())) {
            textInputLayout.f117324r = false;
            this.f193409a.setText(this.f193411d.f14705c);
            textInputLayout.f117324r = true;
        }
        textInputLayout.f117310d.mo48514l(!this.f193411d.f14711i.isEmpty());
        textInputLayout.mo48471f(this.f193411d.f14711i);
        C4659f fVar3 = this.f193411d.f14712j;
        if (fVar3 == null) {
            fVar3 = C4659f.f14603e;
        }
        textInputLayout.f117310d.mo48515m(m107564i(fVar3));
        if (this.f193411d.f14713k) {
            EditText editText3 = this.f193409a;
            this.f193410b = new C58052b(this.f56304o, (AutoCompleteTextView) editText3, new C72740f(this));
            C0778x xVar = (C0778x) editText3;
            xVar.setOnItemClickListener(new C72741g(this));
            xVar.setAdapter(this.f193410b);
            C4665l lVar3 = this.f193411d.f14704b;
            if (((lVar3 == null ? C4665l.f14619k : lVar3).f14621a & 1) != 0) {
                if (lVar3 == null) {
                    lVar3 = C4665l.f14619k;
                }
                C4659f fVar4 = lVar3.f14626f;
                if (fVar4 == null) {
                    fVar4 = C4659f.f14603e;
                }
                xVar.setDropDownBackgroundDrawable(new ColorDrawable(C20566at.m38590a(C19752a.m37609b(fVar4))));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56425d dVar = this.f57588z;
        String obj = this.f193409a.getText().toString();
        C4684a aVar = (C4684a) this.f193411d.toBuilder();
        aVar.copyOnWrite();
        C4685b bVar = (C4685b) aVar.instance;
        obj.getClass();
        bVar.f14703a |= 2;
        bVar.f14705c = obj;
        this.f193411d = (C4685b) aVar.build();
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C4685b.f14701o, this.f193411d);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        if (this.f56305p != null && this.f56306q.mo54637a("set_updater")) {
            this.f56305p.getViewTreeObserver().addOnPreDrawListener(new C72744j(this));
        }
    }
}
