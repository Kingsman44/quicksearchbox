package com.google.android.libraries.accountlinking.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.accountlinking.LinkResponse;

/* renamed from: com.google.android.libraries.accountlinking.activity.i */
/* compiled from: PG */
public final class C147381i {
    /* renamed from: a */
    public static C147389q m240294a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("error_type", Integer.valueOf(i));
        bundle.putString("message", str);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return new C147389q(-2, intent);
    }

    /* renamed from: b */
    public static C147389q m240295b(String str) {
        Intent intent = new Intent();
        intent.putExtra("link_response", new LinkResponse(true, str));
        return new C147389q(-1, intent);
    }
}
