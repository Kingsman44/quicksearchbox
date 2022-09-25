package com.google.android.libraries.social.peoplekit.common.p3280b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3260a.p3265d.C41911d;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42026c;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42027d;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42245m;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.social.peoplekit.common.b.f */
/* compiled from: PG */
public final class C42086f {

    /* renamed from: a */
    public final C42141b f110014a;

    /* renamed from: b */
    public final Context f110015b;

    /* renamed from: c */
    public final ExecutorService f110016c;

    /* renamed from: d */
    public final PeopleKitDataLayer f110017d;

    /* renamed from: e */
    public final C42075e f110018e;

    /* renamed from: f */
    public final PeopleKitVisualElementPath f110019f;

    /* renamed from: g */
    public final C42081a f110020g;

    public C42086f(C42085e eVar) {
        this.f110014a = eVar.f110007a;
        this.f110015b = eVar.f110008b;
        this.f110016c = eVar.f110009c;
        this.f110017d = eVar.f110010d;
        this.f110019f = eVar.f110012f;
        this.f110018e = eVar.f110011e;
        this.f110020g = eVar.f110013g;
    }

    /* renamed from: e */
    public static boolean m73670e(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof C42245m) {
            int a = C42245m.m74207a(th);
            int i = a - 1;
            if (a != 0) {
                return i == 0 || i == 7;
            }
            throw null;
        } else if (th instanceof TimeoutException) {
            return true;
        } else {
            if (th.getCause() != null) {
                return m73670e(th.getCause());
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo44595a(C0392m mVar) {
        C42141b bVar = this.f110014a;
        if (bVar.f110282a != 0) {
            Drawable c = C0678gm.m2375e().mo3100c(this.f110015b, R.drawable.peoplekit_dialog_background);
            C1929b.m5225f(c, C1878d.m5128a(this.f110015b, this.f110014a.f110282a));
            mVar.getWindow().setBackgroundDrawable(c);
            return;
        }
        C42087a.m73676b(bVar);
    }

    /* renamed from: b */
    public final void mo44596b(boolean z, Channel channel) {
        C41911d dVar;
        if (z) {
            dVar = C54941a.f144482w;
        } else {
            dVar = C54941a.f144459V;
        }
        C42087a.m73676b(this.f110014a);
        C0391l lVar = new C0391l(this.f110015b);
        lVar.mo1307l(true != z ? R.string.peoplekit_hide_suggestion_unhide_title : R.string.peoplekit_hide_suggestion_hide_title);
        lVar.mo1300f(true != z ? R.string.peoplekit_hide_suggestion_unhide_text : R.string.peoplekit_hide_suggestion_hide_text);
        lVar.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        lVar.setPositiveButton(true != z ? R.string.peoplekit_hide_suggestion_unhide_button : R.string.peoplekit_hide_suggestion_hide_button, new C42084d(this, dVar, z, channel));
        C0392m create = lVar.create();
        mo44595a(create);
        create.show();
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(dVar));
        peopleKitVisualElementPath.mo44564a(this.f110019f.f109973a);
        this.f110018e.mo44577c(-1, peopleKitVisualElementPath);
    }

    /* renamed from: c */
    public final void mo44597c(PopupWindow popupWindow, View view, int i, Channel channel, String str, String str2) {
        PopupWindow popupWindow2 = popupWindow;
        View view2 = view;
        Channel channel2 = channel;
        String str3 = str;
        String str4 = str2;
        LinearLayout linearLayout = new LinearLayout(this.f110015b);
        LayoutInflater from = LayoutInflater.from(this.f110015b);
        C42087a.m73676b(this.f110014a);
        View inflate = from.inflate(R.layout.peoplekit_hide_suggestion_popup, linearLayout);
        C42027d dVar = new C42027d(new C42026c(this.f110015b, this.f110018e, this.f110019f));
        ((RelativeLayout) inflate.findViewById(R.id.peoplekit_hide_suggestion_popup_avatar)).addView(dVar.f109785a);
        dVar.mo44509e(channel2);
        TextView textView = (TextView) inflate.findViewById(R.id.peoplekit_hide_suggestion_popup_contact_name);
        textView.setText(str4);
        int i2 = this.f110014a.f110286e;
        if (i2 != 0) {
            textView.setTextColor(C1878d.m5128a(this.f110015b, i2));
        }
        if (this.f110014a.f110293l != 0) {
            inflate.findViewById(R.id.peoplekit_hide_suggestion_popup_menu_divider).setBackgroundColor(C1878d.m5128a(this.f110015b, this.f110014a.f110293l));
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.peoplekit_hide_suggestion_popup_contact_method);
        if (TextUtils.isEmpty(str) || TextUtils.equals(str4, str3)) {
            textView.setText(str4);
            textView.setPadding(0, this.f110015b.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding), 0, 0);
            textView2.setVisibility(8);
        } else {
            textView2.setText(str3);
            int i3 = this.f110014a.f110287f;
            if (i3 != 0) {
                textView2.setTextColor(C1878d.m5128a(this.f110015b, i3));
            }
        }
        this.f110017d.mo44669n(channel2);
        boolean z = ((Boolean) C42131a.f110207e.mo37303b()).booleanValue() && !TextUtils.isEmpty(channel.mo44628i()) && !TextUtils.isEmpty(channel.mo44629j());
        View findViewById = inflate.findViewById(z ? R.id.peoplekit_hide_suggestion_edit_contact_row : R.id.peoplekit_hide_suggestion_row);
        findViewById.setVisibility(0);
        if (this.f110014a.f110289h != 0) {
            ((TextView) findViewById.findViewById(true != z ? R.id.peoplekit_hide_suggestion_text : R.id.peoplekit_hide_suggestion_edit_contact_text)).setTextColor(C1878d.m5128a(this.f110015b, this.f110014a.f110289h));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById.findViewById(true != z ? R.id.peoplekit_hide_suggestion_icon : R.id.peoplekit_hide_suggestion_edit_contact_icon);
        int i4 = this.f110014a.f110296o;
        if (i4 != 0) {
            appCompatImageView.setColorFilter(C1878d.m5128a(this.f110015b, i4));
        }
        int i5 = this.f110014a.f110288g;
        if (i5 != 0) {
            findViewById.setBackgroundColor(C1878d.m5128a(this.f110015b, i5));
        }
        View findViewById2 = inflate.findViewById(R.id.peoplekit_hide_suggestion_popup_menu_divider);
        int i6 = this.f110014a.f110293l;
        if (i6 != 0) {
            findViewById2.setBackgroundColor(C1878d.m5128a(this.f110015b, i6));
        }
        findViewById2.setVisibility(0);
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(z ? C54941a.f144470k : C54941a.f144471l));
        peopleKitVisualElementPath.mo44564a(this.f110019f.f109973a);
        this.f110018e.mo44577c(-1, peopleKitVisualElementPath);
        findViewById.setOnClickListener(new C42082b(this, peopleKitVisualElementPath, z, channel, popupWindow));
        popupWindow2.setContentView(inflate);
        C42087a.m73676b(this.f110014a);
        Drawable c = C0678gm.m2375e().mo3100c(this.f110015b, R.drawable.peoplekit_popup_background);
        C42141b bVar = this.f110014a;
        int i7 = bVar.f110288g;
        if (i7 != 0) {
            c.setColorFilter(new PorterDuffColorFilter(C1878d.m5128a(this.f110015b, i7), PorterDuff.Mode.SRC_ATOP));
        } else {
            C42087a.m73676b(bVar);
        }
        popupWindow2.setBackgroundDrawable(c);
        popupWindow2.setElevation((float) this.f110015b.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_elevation));
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        int i9 = iArr[1];
        Point point = new Point();
        ((WindowManager) this.f110015b.getSystemService("window")).getDefaultDisplay().getSize(point);
        int dimensionPixelSize = this.f110015b.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_width);
        int dimensionPixelSize2 = this.f110015b.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding);
        int i10 = i8 + dimensionPixelSize;
        if (i10 > point.x) {
            dimensionPixelSize2 = (point.x - i10) - this.f110015b.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding);
        }
        inflate.measure(View.MeasureSpec.makeMeasureSpec(inflate.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        popupWindow2.showAsDropDown(view2, dimensionPixelSize2, -(i + Math.max(0, (i9 + inflate.getMeasuredHeight()) - point.y)));
    }

    /* renamed from: d */
    public final void mo44598d(String str, String str2) {
        try {
            Uri lookupUri = ContactsContract.Contacts.getLookupUri(Long.parseLong(str), str2);
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(lookupUri, "vnd.android.cursor.item/contact");
            ((Activity) this.f110015b).startActivityForResult(intent, 11);
        } catch (ClassCastException e) {
            Log.e("HideSuggestion", "Failed to cast Context into Activity: ".concat(String.valueOf(e.getMessage())), e);
        } catch (NumberFormatException e2) {
            if (Log.isLoggable("HideSuggestion", 6)) {
                Log.e("HideSuggestion", "Tried to start a Contact activity with an invalid contact ID: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        } catch (ActivityNotFoundException e3) {
            Log.e("HideSuggestion", "Failed to start. a Contact activity: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
