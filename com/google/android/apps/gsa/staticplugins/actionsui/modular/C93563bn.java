package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.p4152bb.p4153a.C55250lk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bn */
/* compiled from: PG */
public final class C93563bn extends C93555bf {

    /* renamed from: a */
    private final C93562bm f261242a = new C93562bm(this);

    /* renamed from: w */
    private final C93652i f261243w;

    public C93563bn(Context context) {
        super(context, (AttributeSet) null, 0, false);
        this.f261243w = new C93652i(context, new ArrayList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87734a() {
        mo87968v(this.f261243w, this.f261242a);
    }

    /* renamed from: f */
    public final void mo87732f() {
        super.mo87732f();
        GroupArgument groupArgument = (GroupArgument) this.f261447m;
        List list = groupArgument.f236183i;
        this.f261243w.mo88083e();
        for (int i = 0; i < list.size(); i++) {
            String str = ((C55250lk) list.get(i)).f145492b;
            this.f261243w.mo88081c(new C91109h(str, Integer.valueOf(i), false));
            if (groupArgument.mo81263C() && i == ((Integer) groupArgument.f236203n).intValue()) {
                mo87970x(str);
            }
        }
        if (groupArgument.mo81263C()) {
            this.f261243w.f261383d = ((Integer) groupArgument.f236203n).intValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo87952k() {
        return true;
    }
}
