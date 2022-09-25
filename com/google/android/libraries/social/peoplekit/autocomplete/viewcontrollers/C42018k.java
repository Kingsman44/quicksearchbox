package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42064j;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.k */
/* compiled from: PG */
final class C42018k implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ PeopleKitSelectionModel f109716a;

    /* renamed from: b */
    final /* synthetic */ C42023p f109717b;

    public C42018k(C42023p pVar, PeopleKitSelectionModel peopleKitSelectionModel) {
        this.f109717b = pVar;
        this.f109716a = peopleKitSelectionModel;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        String str;
        if (keyEvent.getAction() == 0) {
            if (i == 67 && !this.f109717b.f109743t.isEmpty()) {
                C42064j jVar = (C42064j) C58557jl.m90131l(this.f109717b.f109743t);
                ChannelChip channelChip = jVar.f109938b;
                if (!C42131a.m73921d()) {
                    this.f109716a.mo44749e(channelChip.f109916a.f109918a);
                } else if (TextUtils.isEmpty(this.f109717b.f109728e.getText())) {
                    if (!jVar.f109938b.isSelected()) {
                        jVar.mo44553b(true);
                        this.f109717b.mo44489c(channelChip.getContentDescription().toString());
                    } else {
                        this.f109716a.mo44749e(channelChip.f109916a.f109918a);
                        C42023p pVar = this.f109717b;
                        Channel channel = channelChip.f109916a.f109918a;
                        if (channel != null) {
                            String g = C58837ba.m90858g(channel.mo44631l(pVar.f109725b));
                            if (g.isEmpty() || !g.equals(channel.mo44630k(pVar.f109725b))) {
                                str = channel.mo44630k(pVar.f109725b);
                            } else {
                                str = BuildConfig.FLAVOR;
                            }
                            pVar.mo44489c(pVar.f109725b.getString(R.string.peoplekit_contact_removed_description, new Object[]{g, str}));
                        }
                    }
                }
            }
            ((Boolean) C42131a.f110211i.mo37303b()).booleanValue();
        }
        return false;
    }
}
