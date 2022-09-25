package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91669h;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.staticplugins.nowcards.C104377bp;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9152ao;
import com.google.android.apps.p489g.p494d.C9153ap;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.h */
/* compiled from: PG */
public final class C104962h extends C104348l {

    /* renamed from: y */
    private final C91669h f292465y;

    /* renamed from: z */
    private final C105070g f292466z;

    public C104962h(Context context, C91669h hVar, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f292465y = hVar;
        this.f292466z = gVar;
    }

    /* renamed from: L */
    private static View m174017L(LayoutInflater layoutInflater, C9277u uVar, ViewGroup viewGroup) {
        C9277u uVar2 = C9277u.UNKNOWN;
        if (uVar.ordinal() != 47) {
            return layoutInflater.inflate(R.layout.qp_module_embedded, viewGroup, false);
        }
        return layoutInflater.inflate(R.layout.qp_module_embedded_centered_overlay, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return m174017L(layoutInflater, a, mo94115i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return m174017L(this.f290308c.f256406b, uVar, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        int i;
        C9153ap apVar = this.f290310e.f32215v;
        if (apVar == null) {
            apVar = C9153ap.f31590f;
        }
        ViewGroup viewGroup = (ViewGroup) this.f290311f;
        int i2 = 0;
        View view = null;
        if (apVar.f31594c.size() > 0) {
            MetadataLineView metadataLineView = (MetadataLineView) viewGroup.findViewById(R.id.details_container);
            metadataLineView.mo94502d(this.f292466z.mo94516a(this.f290307b, this.f290308c.f256406b, (Map) null, mo94120n()), apVar.f31594c, this.f290314i.f290349s);
            metadataLineView.setVisibility(0);
        }
        if ((apVar.f31592a & 2) != 0) {
            C91669h hVar = this.f292465y;
            Context context = this.f290307b;
            C9278v vVar = apVar.f31595d;
            if (vVar == null) {
                vVar = C9278v.f32165Z;
            }
            C9277u a = C9277u.m23705a(vVar.f32196c);
            if (a == null) {
                a = C9277u.UNKNOWN;
            }
            C104348l b = ((C104377bp) hVar).mo94096b(context, a);
            if (b != null) {
                C91671j jVar = this.f290309d;
                C9278v vVar2 = apVar.f31595d;
                if (vVar2 == null) {
                    vVar2 = C9278v.f32165Z;
                }
                view = b.mo86091a(jVar, vVar2);
                ((ViewGroup) viewGroup.findViewById(R.id.module_container)).addView(view);
            }
        }
        View view2 = view;
        if ((apVar.f31592a & 1) != 0) {
            C9164b bVar = apVar.f31593b;
            if (bVar == null) {
                bVar = C9164b.f31642o;
            }
            mo94116j(viewGroup, bVar, R.id.icon_stub, R.id.icon_background, false);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.action_icon);
            C9153ap apVar2 = this.f290310e.f32215v;
            if (apVar2 == null) {
                apVar2 = C9153ap.f31590f;
            }
            int a2 = C9152ao.m23680a(apVar2.f31596e);
            if (a2 != 0 && a2 == 2) {
                i = this.f290307b.getResources().getDimensionPixelSize(R.dimen.embedded_overlay_icon_size);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                i2 = this.f290307b.getResources().getDimensionPixelSize(R.dimen.embedded_icon_size);
                i = i2;
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            if (view2 != null) {
                C91115n.m148874f(view2, 3, i2 + viewGroup.getPaddingRight());
            }
        }
    }
}
