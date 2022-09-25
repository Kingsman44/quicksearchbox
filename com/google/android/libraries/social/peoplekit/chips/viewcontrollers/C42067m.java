package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.material.chip.Chip;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.m */
/* compiled from: PG */
public final class C42067m {
    /* renamed from: a */
    public static void m73630a(Context context, Chip chip, Channel channel, String str) {
        m73631b(context, chip, channel, str);
        chip.mo47694q(new C42069o(context));
    }

    /* renamed from: b */
    public static void m73631b(Context context, Chip chip, Channel channel, String str) {
        if (channel.mo44612D()) {
            str = channel.mo44630k(context);
        } else if (TextUtils.isEmpty(str)) {
            str = channel.mo44631l(context);
        }
        chip.setText(str);
    }
}
