package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42013f;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.aj */
/* compiled from: PG */
final class C41971aj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Channel f109557a;

    /* renamed from: b */
    final /* synthetic */ C41982au f109558b;

    /* renamed from: c */
    final /* synthetic */ C41979ar f109559c;

    public C41971aj(C41979ar arVar, Channel channel, C41982au auVar) {
        this.f109559c = arVar;
        this.f109557a = channel;
        this.f109558b = auVar;
    }

    public final void onClick(View view) {
        C42013f fVar;
        if (!(this.f109557a instanceof ManualChannel) || (fVar = this.f109559c.f109589n) == null || !fVar.f109709a.mo44499q()) {
            String str = null;
            if (this.f109557a.mo44621b() == 0 || (!((PeopleKitConfigImpl) this.f109559c.f109580e).f110248o && this.f109557a.mo44621b() == 2)) {
                Context context = this.f109559c.f109576a;
                if (TextUtils.isEmpty((CharSequence) null)) {
                    str = this.f109559c.f109576a.getResources().getString(true != ((PeopleKitConfigImpl) this.f109559c.f109580e).f110248o ? R.string.peoplekit_listview_invalid_input_no_phone_number : R.string.peoplekit_invalid_input);
                }
                Toast.makeText(context, str, 0).show();
                C42075e eVar = this.f109559c.f109579d;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144439B));
                peopleKitVisualElementPath.mo44564a(this.f109559c.f109582g.f109973a);
                eVar.mo44577c(-1, peopleKitVisualElementPath);
            } else if (this.f109559c.f109578c.mo44752h(this.f109557a, (CoalescedChannels) null)) {
                this.f109558b.mo44444c(this.f109559c.f109576a.getResources().getString(R.string.peoplekit_contact_selected));
                this.f109558b.mo44443b(true);
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                if (this.f109557a instanceof ManualChannel) {
                    peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144462c));
                } else {
                    peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144465f));
                }
                C41979ar arVar = this.f109559c;
                if (((PeopleKitConfigImpl) arVar.f109580e).f110244k) {
                    View view2 = this.f109558b.f109602b;
                    Channel channel = this.f109557a;
                    View findViewById = view2.findViewById(R.id.peoplekit_row_progress_bar);
                    arVar.f109583h = true;
                    view2.postDelayed(new C41975an(arVar, findViewById), 200);
                    arVar.f109577b.mo44666k(channel, new C41977ap(arVar, view2, findViewById, channel));
                } else {
                    arVar.f109581f.mo44409a(this.f109557a.mo44626g(arVar.f109576a));
                }
                peopleKitVisualElementPath2.mo44564a(this.f109559c.f109582g.f109973a);
                this.f109559c.f109579d.mo44577c(4, peopleKitVisualElementPath2);
            }
        } else {
            C42075e eVar2 = this.f109559c.f109579d;
            PeopleKitVisualElementPath peopleKitVisualElementPath3 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath3.f109973a.mo44369a(new C41952a(C54941a.f144462c));
            peopleKitVisualElementPath3.mo44564a(this.f109559c.f109582g.f109973a);
            eVar2.mo44577c(4, peopleKitVisualElementPath3);
        }
    }
}
