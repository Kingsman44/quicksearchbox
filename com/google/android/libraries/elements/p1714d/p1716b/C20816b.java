package com.google.android.libraries.elements.p1714d.p1716b;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.litho.C6138bs;
import com.google.android.libraries.elements.interfaces.DirectUpdateExecutor;
import com.google.protos.youtube.elements.C66156ca;
import java.util.Map;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.b.b */
/* compiled from: PG */
public final class C20816b extends DirectUpdateExecutor {

    /* renamed from: a */
    private Handler f58291a;

    /* renamed from: b */
    private final Map f58292b;

    /* renamed from: c */
    private final DisplayMetrics f58293c;

    public C20816b(Map map, DisplayMetrics displayMetrics) {
        this.f58292b = map;
        this.f58293c = displayMetrics;
    }

    /* renamed from: a */
    private final void m39088a(C6138bs bsVar, Object obj) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (this.f58291a == null) {
                this.f58291a = new Handler(Looper.getMainLooper());
            }
            this.f58291a.post(new C20815a(bsVar, obj));
            return;
        }
        bsVar.mo13118a(obj);
    }

    public final Status applyChangeStylePropertiesBackgroundColor(long j) {
        C6138bs bsVar = (C6138bs) this.f58292b.get(C66156ca.DYNAMIC_PROP_TYPE_BACKGROUND_COLOR);
        if (bsVar != null && (bsVar.f18160a instanceof Long)) {
            m39088a(bsVar, Long.valueOf(j));
        }
        return Status.f186902OK;
    }

    public final Status applyChangeStylePropertiesOpacity(float f) {
        C6138bs bsVar = (C6138bs) this.f58292b.get(C66156ca.DYNAMIC_PROP_TYPE_ALPHA);
        if (bsVar != null && (bsVar.f18160a instanceof Float)) {
            m39088a(bsVar, Float.valueOf(f));
        }
        return Status.f186902OK;
    }

    public final Status applyChangeStylePropertiesRotation(float f) {
        C6138bs bsVar = (C6138bs) this.f58292b.get(C66156ca.DYNAMIC_PROP_TYPE_ROTATION);
        if (bsVar != null && (bsVar.f18160a instanceof Float)) {
            m39088a(bsVar, Float.valueOf(f));
        }
        return Status.f186902OK;
    }

    public final Status applyChangeStylePropertiesScale(float f) {
        C6138bs bsVar = (C6138bs) this.f58292b.get(C66156ca.DYNAMIC_PROP_TYPE_SCALE);
        if (bsVar != null && (bsVar.f18160a instanceof Float)) {
            m39088a(bsVar, Float.valueOf(f));
        }
        return Status.f186902OK;
    }

    public final Status applyChangeStylePropertiesTranslation(float f, float f2) {
        C6138bs bsVar = (C6138bs) this.f58292b.get(C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (bsVar != null && (bsVar.f18160a instanceof Float)) {
            m39088a(bsVar, Float.valueOf(TypedValue.applyDimension(1, f, this.f58293c)));
        }
        C6138bs bsVar2 = (C6138bs) this.f58292b.get(C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (bsVar2 != null && (bsVar2.f18160a instanceof Float)) {
            m39088a(bsVar2, Float.valueOf(TypedValue.applyDimension(1, f2, this.f58293c)));
        }
        return Status.f186902OK;
    }
}
