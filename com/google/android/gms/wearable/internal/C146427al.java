package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.data.C143865e;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C146528k;
import com.google.android.gms.wearable.C146529l;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.al */
/* compiled from: PG */
public final class C146427al extends C143865e implements C146528k {

    /* renamed from: d */
    private final int f395649d;

    public C146427al(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f395649d = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final Uri mo123132b() {
        return Uri.parse(mo119337kv("path"));
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] g = mo119334g("data");
        HashMap hashMap = new HashMap(this.f395649d);
        for (int i = 0; i < this.f395649d; i++) {
            C146425aj ajVar = new C146425aj(this.f389974a, this.f389975b + i);
            if (ajVar.mo119337kv("asset_key") != null) {
                hashMap.put(ajVar.mo119337kv("asset_key"), ajVar);
            }
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(mo123132b()))));
        if (g == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(g.length);
        }
        sb.append(", dataSz=".concat(obj.toString()));
        int size = hashMap.size();
        sb.append(", numAssets=" + size);
        if (isLoggable && !hashMap.isEmpty()) {
            sb.append(", assets=[");
            String str = BuildConfig.FLAVOR;
            for (Map.Entry entry : hashMap.entrySet()) {
                String c = ((C146529l) entry.getValue()).mo123129c();
                sb.append(str + ((String) entry.getKey()) + ": " + c);
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
