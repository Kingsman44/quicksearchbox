package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.app.FragmentManager;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88519m;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dx */
/* compiled from: PG */
public final class C93627dx extends C93555bf {
    public C93627dx(Context context, byte[] bArr) {
        super(context, (AttributeSet) null, 0, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87734a() {
        this.f261451q.mo87961i(this.f261447m, "durationpicker_tag");
    }

    /* renamed from: f */
    public final void mo87732f() {
        C88519m mVar;
        super.mo87732f();
        TimeDurationArgument timeDurationArgument = (TimeDurationArgument) this.f261447m;
        if (timeDurationArgument.mo81263C()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(((Long) timeDurationArgument.f236203n).longValue());
            mo87970x(C89407a.m145420c(getContext().getResources(), seconds, false));
            this.f261218b.setContentDescription(C89407a.m145420c(getContext().getResources(), seconds, true));
        }
        FragmentManager c = this.f261451q.mo87959c();
        if (c != null && (mVar = (C88519m) c.findFragmentByTag("durationpicker_tag")) != null) {
            mVar.f239239d = new C93626dw(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo87952k() {
        return false;
    }

    public C93627dx(Context context) {
        super(context, (AttributeSet) null, 0, true);
    }
}
