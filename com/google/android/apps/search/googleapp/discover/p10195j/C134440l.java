package com.google.android.apps.search.googleapp.discover.p10195j;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.p5476a.C69640a;
import p5462h.p5473f.p5475b.p5476a.C69642c;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.l */
/* compiled from: PG */
public final class C134440l {
    /* renamed from: a */
    public static final Map m218162a(View view) {
        Object tag = view.getTag(R.id.googleapp_discover_tag_visibility_tracking_map);
        if ((tag instanceof C69640a) && !(tag instanceof C69642c)) {
            C69651ah.m101036a(tag, "kotlin.collections.MutableMap");
        }
        try {
            Map map = (Map) tag;
            if (map != null) {
                return map;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            view.setTag(R.id.googleapp_discover_tag_visibility_tracking_map, linkedHashMap);
            return linkedHashMap;
        } catch (ClassCastException e) {
            C69651ah.m101039d(e);
            throw e;
        }
    }
}
