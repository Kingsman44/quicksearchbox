package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.actionsui.C93437ad;
import com.google.p4152bb.p4153a.C55177is;
import java.util.Comparator;

/* compiled from: PG */
public class EntityDisambiguationView extends C93437ad {

    /* renamed from: f */
    public C91189au f261023f;

    /* renamed from: g */
    public C88511e f261024g;

    public EntityDisambiguationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo87719a(Parcelable parcelable, Object obj, boolean z, Comparator comparator) {
        Void voidR = (Void) obj;
        return EntitySelectItem.m154086b((EntityArgument.Entity) parcelable, this.f260789b, this, this.f261023f, this.f261024g, (C55177is) null, false, true != this.f260792e ? 1 : 2);
    }

    public EntityDisambiguationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EntityDisambiguationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
