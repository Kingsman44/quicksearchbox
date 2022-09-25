package com.google.android.apps.gsa.searchplate;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ListView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.searchplate.at */
/* compiled from: PG */
final class C88918at implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C88923ay f240872a;

    public C88918at(C88923ay ayVar) {
        this.f240872a = ayVar;
    }

    public final void onClick(View view) {
        C88923ay ayVar = this.f240872a;
        ayVar.f240888k = ayVar.f240882e.getSelectedItemPosition();
        C88923ay ayVar2 = this.f240872a;
        ayVar2.f240890m = new C88922ax(ayVar2, ayVar2.f240886i, ayVar2.f240881d);
        C88923ay ayVar3 = this.f240872a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < ayVar3.f240878a.size(); i2++) {
            if (ayVar3.f240881d.contains(ayVar3.f240878a.get(i2))) {
                arrayList.add((String) ayVar3.f240878a.get(i2));
                arrayList2.add((String) ayVar3.f240879b.get(i2));
            }
        }
        for (int i3 = 0; i3 < ayVar3.f240878a.size(); i3++) {
            if (!ayVar3.f240881d.contains(ayVar3.f240878a.get(i3))) {
                arrayList.add((String) ayVar3.f240878a.get(i3));
                arrayList2.add((String) ayVar3.f240879b.get(i3));
            }
        }
        ayVar3.f240878a.clear();
        ayVar3.f240879b.clear();
        ayVar3.f240878a.addAll(arrayList);
        ayVar3.f240879b.addAll(arrayList2);
        C88922ax axVar = this.f240872a.f240890m;
        AlertDialog.Builder builder = new AlertDialog.Builder(axVar.f240877c.f240880c, R.style.VoiceSettingsDialogStyle);
        builder.setTitle(R.string.settings_entrypoint);
        builder.setMultiChoiceItems((String[]) axVar.f240877c.f240879b.toArray(new String[0]), (boolean[]) null, new C88920av(axVar)).setPositiveButton(R.string.confirm_language_selection, new C88919au(axVar)).setNegativeButton(R.string.cancel_language_selection, new C88921aw());
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        create.show();
        for (String contains : axVar.f240877c.f240878a) {
            listView.setItemChecked(i, axVar.f240876b.contains(contains));
            i++;
        }
    }
}
