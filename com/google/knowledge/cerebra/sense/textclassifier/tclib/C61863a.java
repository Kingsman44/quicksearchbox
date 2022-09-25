package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.text.TextUtils;
import androidx.core.app.C1803at;
import com.google.common.base.C58815af;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.a */
/* compiled from: PG */
final class C61863a extends C58815af {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo56071a(Object obj) {
        C1803at atVar = (C1803at) obj;
        return Arrays.hashCode(new Object[]{atVar.f5633d, atVar.f5630a, atVar.f5632c});
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo56072b(Object obj, Object obj2) {
        C1803at atVar = (C1803at) obj;
        C1803at atVar2 = (C1803at) obj2;
        return C58832aw.m90831a(atVar.f5633d, atVar2.f5633d) && TextUtils.equals(atVar.f5630a, atVar2.f5630a) && C58832aw.m90831a(atVar.f5632c, atVar2.f5632c);
    }
}
