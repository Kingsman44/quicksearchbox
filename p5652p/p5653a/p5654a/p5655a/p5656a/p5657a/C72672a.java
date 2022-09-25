package p5652p.p5653a.p5654a.p5655a.p5656a.p5657a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56425d;
import com.google.p4463ce.p4464a.p4465a.p4466a.p4469b.C58053a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p211b.p212a.p213a.C4647b;
import p211b.p212a.p213a.C4649d;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;

/* renamed from: p.a.a.a.a.a.a */
/* compiled from: PG */
public class C72672a extends C20061bs {

    /* renamed from: a */
    private boolean f193260a;

    /* renamed from: b */
    private int f193261b;

    public C72672a(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        Object obj;
        C56425d dVar = this.f57588z;
        C62940bt r1 = C62942bv.checkIsLite(C4647b.f14569h);
        dVar.mo58887l(r1);
        Object l = dVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        int a = C4649d.m13053a(((C4647b) obj).f14575e);
        return (Button) LayoutInflater.from(context).inflate((a == 0 || a == 1) ? R.layout.flat_material_button : R.layout.raised_material_button, (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4647b.f14569h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4647b bVar = (C4647b) obj;
        int a = C4649d.m13053a(bVar.f14575e);
        if (a == 0) {
            a = 1;
        }
        this.f193261b = a;
        this.f193260a = bVar.f14576f;
        if ((bVar.f14571a & 1) != 0) {
            ((Button) this.f56305p).setText(bVar.f14572b);
        }
        if ((bVar.f14571a & 2) != 0) {
            C4659f fVar = bVar.f14573c;
            if (fVar == null) {
                fVar = C4659f.f14603e;
            }
            ((Button) this.f56305p).setTextColor(C72675d.m107488a(C58053a.m88812a(fVar), 0.26f));
        } else {
            Button button = (Button) this.f56305p;
            ColorStateList textColors = button.getTextColors();
            int i = C72675d.f193268a;
            button.setTextColor(C72675d.m107488a(textColors.getDefaultColor(), 0.26f));
        }
        if (this.f193261b == 1) {
            ((Button) this.f56305p).setBackground(new RippleDrawable(ColorStateList.valueOf(C72675d.m107489b(0.4f)), (Drawable) null, this.f56304o.getResources().getDrawable(R.drawable.abc_btn_default_mtrl_shape).mutate()));
        }
        C4665l lVar = bVar.f14574d;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        mo25249w(C19752a.m37610c(lVar));
        C4665l lVar2 = bVar.f14574d;
        if (lVar2 == null) {
            lVar2 = C4665l.f14619k;
        }
        if ((lVar2.f14621a & 1) == 0 && this.f193261b == 2 && bVar.f14576f) {
            ((Button) this.f56305p).setBackgroundTintMode(PorterDuff.Mode.SRC);
            ((Button) this.f56305p).setBackgroundTintList(ColorStateList.valueOf(C72675d.m107489b(0.12f)));
        }
        if (this.f193261b == 2 && (((Button) this.f56305p).getBackground() instanceof RippleDrawable)) {
            ((RippleDrawable) ((Button) this.f56305p).getBackground()).setColor(ColorStateList.valueOf(-1711276033));
        }
        ((Button) this.f56305p).setEnabled(!this.f193260a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kE */
    public final void mo25188kE(int i) {
        if (this.f193261b == 2 && ((Button) this.f56305p).getBackground() != null) {
            View view = this.f56305p;
            ColorStateList a = C72675d.m107488a(i, 0.12f);
            view.setBackgroundTintMode(PorterDuff.Mode.SRC);
            view.setBackgroundTintList(a);
        }
    }
}
