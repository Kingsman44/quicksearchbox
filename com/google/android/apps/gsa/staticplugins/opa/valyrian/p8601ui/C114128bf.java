package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1998r;
import androidx.viewpager.widget.C4268a;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bf */
/* compiled from: PG */
final class C114128bf extends C2061c {

    /* renamed from: a */
    final /* synthetic */ ValyrianViewPager f316335a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114128bf(ValyrianViewPager valyrianViewPager) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f316335a = valyrianViewPager;
    }

    /* renamed from: a */
    private final boolean m189292a() {
        C4268a aVar = this.f316335a.f316158e;
        return aVar != null && aVar.mo9175k() > 1;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C4268a aVar;
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C1998r rVar = new C1998r(AccessibilityRecord.obtain());
        rVar.f5926a.setScrollable(m189292a());
        if (accessibilityEvent.getEventType() == 4096 && (aVar = this.f316335a.f316158e) != null) {
            rVar.f5926a.setItemCount(aVar.mo9175k());
            rVar.f5926a.setFromIndex(this.f316335a.f316159f);
            rVar.f5926a.setToIndex(this.f316335a.f316159f);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setClassName(ViewPager.class.getName());
        kVar.f5921a.setScrollable(m189292a());
        if (this.f316335a.mo101096m(1)) {
            kVar.f5921a.addAction(4096);
        }
        if (this.f316335a.mo101096m(-1)) {
            kVar.f5921a.addAction(8192);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.f316335a.mo101096m(-1)) {
                return false;
            }
            ValyrianViewPager valyrianViewPager = this.f316335a;
            valyrianViewPager.mo101086g(valyrianViewPager.f316159f - 1);
            return true;
        } else if (!this.f316335a.mo101096m(1)) {
            return false;
        } else {
            ValyrianViewPager valyrianViewPager2 = this.f316335a;
            valyrianViewPager2.mo101086g(valyrianViewPager2.f316159f + 1);
            return true;
        }
    }
}
