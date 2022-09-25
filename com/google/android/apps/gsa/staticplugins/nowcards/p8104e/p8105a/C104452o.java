package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.o */
/* compiled from: PG */
public final class C104452o implements C23113i {

    /* renamed from: a */
    private final C104450m f290575a;

    public C104452o(C104450m mVar) {
        this.f290575a = mVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("CarouselEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onCarouselLockUpdateEvent_boolean")) {
                this.f290575a.mo94182c(Boolean.valueOf(pVar.f63472a.getBoolean("unlocked")).booleanValue());
            } else if (str.equals("onCarouselPositionUpdateEvent_int_int")) {
                this.f290575a.mo94183d(Integer.valueOf(pVar.f63472a.getInt("position")).intValue(), Integer.valueOf(pVar.f63472a.getInt("offset")).intValue());
            } else if (str.equals("onScrollEvent_int_long")) {
                this.f290575a.mo86301b(Integer.valueOf(pVar.f63472a.getInt("scrollAmount")).intValue(), Long.valueOf(pVar.f63472a.getLong("scrollEndTimestamp")).longValue());
            }
        }
    }
}
