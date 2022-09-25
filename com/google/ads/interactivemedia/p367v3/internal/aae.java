package com.google.ads.interactivemedia.p367v3.internal;

import android.graphics.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aae */
/* compiled from: PG */
public final class aae {

    /* renamed from: a */
    public static final Pattern f20047a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    static {
        Pattern.compile("(\\S+?):(\\S+)");
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        Collections.unmodifiableMap(hashMap2);
    }
}
