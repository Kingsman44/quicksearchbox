package com.bumptech.glide.load.p297b;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.C5960s;

/* renamed from: com.bumptech.glide.load.b.bd */
/* compiled from: PG */
public final class C5779bd implements C5764ap {

    /* renamed from: a */
    private final C5764ap f17374a;

    /* renamed from: b */
    private final Resources f17375b;

    public C5779bd(Resources resources, C5764ap apVar) {
        this.f17375b = resources;
        this.f17374a = apVar;
    }

    /* renamed from: c */
    private final Uri m14951c(Integer num) {
        try {
            String resourcePackageName = this.f17375b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.f17375b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.f17375b.getResourceEntryName(num.intValue());
            return Uri.parse("android.resource://" + resourcePackageName + "/" + resourceTypeName + "/" + resourceEntryName);
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            new StringBuilder("Received invalid resource id: ").append(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri c = m14951c((Integer) obj);
        if (c == null) {
            return null;
        }
        return this.f17374a.mo11928a(c, i, i2, sVar);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
